#!/usr/bin/env bash

var_file="$(timeout 4 mode2 -r -d /dev/lirc0)"
#var_file="$(cat $1)"

line_one=$(echo -e "$var_file" | head -n 1)
line_one_first_five="$(echo "$line_one" | cut -c1-5)"
if [[ $line_one_first_five = "space" ]]; then
  var_file="$(echo -e "$var_file" | tail -n +2)"
fi

var_output=""

while read -r line; do
  line="$(echo $line | cut -c6-), "
  var_output="$var_output$line\n"
done <<< "$var_file"
var_output="$(echo -e $var_output)"

var_outputfile=""
var_tillfullline=""

var_linecount=$(echo -e "$var_output" | wc -l)

var_currentround=0
while read -r line; do
  var_currentround=$(($var_currentround + 1))
  var_thislinelength=${#line}
  var_tillfulllinelength=${#var_tillfullline}
  var_lengthtogether=$(($var_thislinelength + $var_tillfulllinelength))

  # Max varlength should be 89 or 101 with tabs
  if (( $var_lengthtogether < 89 )); then
    var_tillfullline="$var_tillfullline$line "
  else
    var_outputfile="$var_outputfile$var_tillfullline \n"
    var_tillfullline=""
  fi

  if (( $var_currentround == $var_linecount )); then
    lastlineImConfused="$(echo $var_tillfullline | rev | cut -c2- | rev)"
    var_outputfile="$var_outputfile$lastlineImConfused"
  fi
done <<< "$var_output"

var_output_intarray="int[] NAME = {\n$var_outputfile\n};"
echo -e "$var_output_intarray"
