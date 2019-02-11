package com.stylog.ircontrol;

public interface PatternStrip {
    // On-Off
    int[] ON = {
            9175, 4469, 612, 539, 603, 508, 637, 507, 611, 533, 609, 509, 636, 510, 609, 535, 630,
            486, 637, 1638, 615, 1639, 613, 1641, 640, 1642, 613, 505, 637, 1640, 614, 1641, 613,
            1646, 633, 1642, 612, 1642, 608, 534, 610, 513, 632, 510, 609, 533, 609, 512, 608, 535,
            608, 534, 608, 507, 612, 1667, 612, 1642, 612, 1641, 639, 1641, 614, 1639, 613, 1642,
            638, 41099, 9177, 2222, 613
    };

    int[] OFF = {
            9187, 4442, 641, 533, 610, 512, 606, 536, 611, 536, 605, 514, 604, 537, 580, 568, 606,
            510, 633, 1645, 583, 1671, 611, 1642, 639, 1643, 612, 508, 638, 1640, 612, 1643, 585,
            1669, 638, 509, 581, 1672, 639, 510, 644, 511, 571, 537, 641, 504, 610, 537, 608, 511,
            634, 1641, 590, 531, 608, 1671, 583, 1671, 617, 1621, 637, 1660, 585, 1670, 615, 1639,
            640, 41094, 9194, 2223, 613
    };

    // Brightness
    int[] BRIGHTNESS_DOWN = {
            9366, 4466, 626, 532, 623, 506, 652, 511, 617, 533, 621, 506, 656, 502, 616, 533, 643,
            487, 645, 1639, 623, 1638, 624, 1639, 650, 1639, 624, 508, 647, 1638, 627, 1637, 626,
            1645, 645, 1650, 613, 509, 644, 510, 617, 535, 618, 508, 645, 507, 619, 532, 621, 512,
            640, 507, 621, 1639, 649, 1639, 622, 1647, 617, 1636, 650, 1649, 611, 1639, 622, 1658,
            630, 41088, 9281, 2221, 618
    };

    int[] BRIGHTNESS_UP = {
            9213, 4474, 591, 561, 607, 514, 637, 512, 607, 539, 607, 512, 633, 514, 605, 540, 605,
            514, 634, 1652, 605, 1648, 608, 1648, 632, 1650, 611, 511, 638, 1648, 604, 1645, 609,
            1646, 636, 513, 607, 538, 608, 512, 634, 512, 608, 538, 607, 514, 629, 515, 606, 539,
            604, 1647, 608, 1646, 633, 1653, 601, 1646, 606, 1638, 645, 1647, 605, 1649, 607, 1647,
            634, 41100, 9181, 2230, 580
    };

    // Modes
    int[] FLASH = {
            9199, 4469, 614, 534, 608, 513, 635, 507, 611, 533, 613, 508, 644, 500, 583, 594, 580,
            508, 638, 1640, 615, 1640, 612, 1645, 640, 1641, 615, 512, 632, 1639, 615, 1641, 616,
            1640, 640, 1641, 616, 1640, 585, 561, 583, 1670, 615, 534, 610, 507, 639, 522, 592, 536,
            613, 506, 641, 507, 609, 1642, 642, 509, 609, 1639, 642, 1642, 613, 1640, 614, 1641,
            611, 41124, 9168, 2250, 614
    };

    int[] STROBE = {
            9195, 4467, 615, 532, 612, 513, 632, 506, 613, 533, 611, 509, 650, 498, 608, 535, 610,
            506, 641, 1641, 611, 1642, 614, 1640, 640, 1638, 618, 512, 633, 1640, 612, 1642, 615,
            1640, 642, 1639, 615, 1641, 612, 1642, 642, 1643, 608, 510, 634, 508, 612, 532, 611,
            509, 637, 506, 588, 560, 609, 505, 699, 452, 606, 1640, 641, 1640, 614, 1641, 614, 1639,
            641, 41091, 9185, 2221, 613
    };

    int[] FADE = {
            9177, 4464, 612, 534, 609, 510, 603, 539, 610, 542, 602, 513, 629, 510, 609, 532, 611,
            507, 636, 1642, 611, 1640, 615, 1642, 636, 1643, 582, 541, 634, 1640, 611, 1644, 612,
            1641, 640, 1640, 615, 1639, 613, 532, 611, 505, 640, 1640, 613, 508, 635, 507, 610, 538,
            606, 539, 605, 514, 604, 1641, 639, 1643, 620, 499, 635, 1641, 614, 1661, 589, 1644,
            640, 41090, 9181, 2218, 612
    };

    int[] SMOOTH = {
            9169, 4474, 607, 534, 613, 505, 633, 510, 610, 535, 609, 507, 640, 505, 609, 535, 609,
            509, 635, 1642, 609, 1646, 611, 1641, 640, 1643, 610, 509, 635, 1643, 611, 1642, 611,
            1643, 637, 1643, 610, 1645, 608, 1645, 637, 509, 607, 1645, 634, 512, 605, 539, 605,
            512, 633, 512, 605, 540, 605, 510, 632, 1648, 603, 517, 629, 1649, 606, 1646, 607, 1648,
            631, 41100, 9177, 2233, 603
    };

    // White
    int[] WHITE = {
            9183, 4465, 614, 533, 613, 508, 637, 538, 581, 538, 605, 507, 638, 507, 579, 566, 608,
            509, 637, 1641, 613, 1643, 612, 1640, 640, 1642, 611, 508, 636, 1641, 612, 1642, 612,
            1642, 638, 1641, 612, 1643, 611, 1641, 644, 503, 609, 533, 610, 509, 635, 506, 611, 536,
            608, 513, 631, 510, 607, 534, 610, 1642, 611, 1641, 634, 1647, 611, 1643, 610, 1641,
            640, 41101, 9175, 2224, 611
    };

    // Red
    int[] RED_1 = {
            9177, 4464, 595, 553, 609, 541, 606, 504, 614, 532, 612, 511, 636, 508, 610, 535, 617,
            500, 634, 1645, 613, 1641, 583, 1681, 635, 1637, 614, 507, 638, 1641, 585, 1670, 613,
            1644, 641, 507, 609, 534, 613, 1645, 610, 536, 608, 509, 639, 516, 602, 535, 608, 510,
            607, 1671, 614, 1639, 616, 532, 612, 1641, 615, 1640, 641, 1640, 582, 1673, 614, 1641,
            645, 41092, 9193, 2227, 609
    };

    int[] RED_2 = {
            9475, 4459, 634, 532, 626, 503, 657, 502, 629, 529, 627, 505, 656, 511, 645, 506, 623,
            503, 656, 1639, 628, 1639, 627, 1638, 655, 1639, 629, 504, 654, 1637, 630, 1637, 627,
            1647, 650, 506, 595, 560, 625, 504, 654, 1637, 626, 505, 650, 505, 619, 534, 623, 505,
            649, 1649, 614, 1641, 627, 1638, 656, 503, 627, 1639, 652, 1640, 623, 1642, 626, 1641,
            653, 41085, 9374, 2223, 625
    };

    int[] ORANGE_1 = {
            9371, 4467, 627, 526, 618, 506, 642, 508, 617, 532, 619, 507, 646, 508, 621, 532, 622,
            505, 649, 1653, 611, 1642, 592, 1668, 650, 1639, 622, 506, 647, 1642, 620, 1639, 624,
            1640, 643, 512, 616, 534, 613, 1642, 619, 1639, 649, 506, 616, 532, 617, 508, 642, 508,
            615, 1642, 648, 1639, 619, 507, 644, 506, 618, 1640, 646, 1640, 619, 1640, 620, 1639,
            646, 41084, 9350, 2217, 624
    };

    int[] ORANGE_2 = {
            9404, 4465, 629, 530, 624, 511, 645, 507, 624, 525, 624, 502, 649, 506, 619, 532, 621,
            504, 653, 1639, 623, 1638, 629, 1635, 672, 1619, 622, 506, 651, 1637, 624, 1638, 619,
            1641, 651, 503, 621, 533, 622, 503, 649, 535, 589, 1638, 654, 504, 624, 531, 622, 505,
            653, 1636, 628, 1639, 623, 1636, 657, 1633, 625, 508, 648, 1636, 626, 1636, 629, 1633,
            653, 41083, 9329, 2219, 626
    };

    int[] YELLOW = {
            9184, 4530, 598, 547, 601, 518, 578, 573, 598, 546, 603, 517, 578, 568, 606, 541, 602,
            521, 578, 1705, 552, 1707, 605, 1648, 632, 1652, 553, 571, 631, 1649, 608, 1648, 608,
            1649, 637, 512, 604, 543, 599, 1655, 608, 541, 606, 1648, 552, 597, 605, 513, 636, 511,
            611, 1646, 635, 1652, 602, 519, 632, 1647, 608, 511, 633, 1650, 609, 1647, 614, 1643,
            633, 41097, 9226, 2230, 608
    };

    // Green
    int[] GREEN_1 = {
            9277, 4468, 618, 532, 616, 506, 644, 507, 615, 529, 620, 506, 641, 509, 617, 530, 617,
            505, 658, 1627, 616, 1646, 617, 1639, 645, 1642, 619, 505, 645, 1639, 619, 1641, 616,
            1642, 644, 1641, 614, 511, 665, 1616, 619, 513, 635, 506, 615, 532, 615, 506, 642, 507,
            615, 536, 615, 1640, 613, 532, 614, 1641, 618, 1640, 643, 1640, 619, 1639, 617, 1640,
            642, 41100, 9212, 2224, 615
    };

    int[] GREEN_2 = {
            9229, 4470, 610, 536, 609, 509, 636, 511, 609, 532, 582, 537, 637, 509, 610, 533, 611,
            508, 636, 1642, 610, 1645, 612, 1642, 639, 1642, 612, 509, 636, 1644, 610, 1641, 617,
            1637, 640, 1640, 614, 506, 647, 498, 611, 1642, 645, 512, 600, 535, 610, 507, 639, 506,
            610, 534, 610, 1642, 612, 1643, 639, 507, 612, 1641, 638, 1643, 611, 1643, 612, 1641,
            639, 41090, 9196, 2224, 612
    };

    int[] LIGHT_BLUE = {
            9209, 4465, 613, 534, 610, 509, 630, 516, 609, 537, 551, 568, 635, 508, 611, 536, 609,
            510, 647, 1633, 612, 1644, 610, 1643, 580, 1701, 612, 509, 636, 1649, 607, 1615, 639,
            1645, 638, 1643, 611, 508, 663, 1622, 616, 1635, 612, 536, 608, 510, 636, 509, 610, 536,
            608, 510, 638, 1642, 613, 508, 636, 510, 611, 1645, 688, 1592, 610, 1643, 614, 1641, 636
    };

    int[] TURQUOISE = {
            9224, 4466, 619, 531, 615, 505, 642, 507, 616, 532, 615, 506, 642, 505, 615, 530, 623,
            499, 642, 1645, 613, 1639, 617, 1638, 646, 1638, 618, 507, 641, 1639, 619, 1637, 617,
            1641, 643, 1641, 614, 508, 638, 509, 613, 533, 614, 1639, 616, 534, 612, 507, 640, 513,
            607, 534, 613, 1639, 615, 1640, 640, 1642, 616, 511, 636, 1638, 616, 1640, 617, 1638,
            644, 41084, 9220, 2221, 617
    };

    int[] CYAN = {
            9173, 4500, 580, 566, 580, 538, 608, 539, 581, 563, 581, 537, 631, 515, 580, 565, 603,
            515, 609, 1669, 588, 1668, 582, 1673, 607, 1672, 582, 538, 605, 1673, 584, 1671, 582,
            1671, 635, 1647, 578, 541, 632, 1647, 581, 539, 633, 1646, 603, 517, 609, 537, 581, 561,
            582, 537, 611, 1674, 578, 537, 607, 1671, 582, 538, 605, 1674, 611, 1642, 588, 1668,
            609, 41118, 9185, 2252, 609
    };

    // Blue
    int[] DARK_BLUE = {
            9239, 4473, 614, 535, 617, 505, 644, 506, 619, 536, 611, 505, 640, 508, 617, 541, 602,
            516, 631, 1642, 620, 1640, 618, 1641, 642, 1641, 617, 508, 609, 1674, 617, 1640, 614,
            1645, 639, 510, 614, 1641, 641, 1643, 614, 507, 639, 509, 612, 537, 580, 537, 638, 511,
            579, 1674, 641, 508, 581, 566, 611, 1643, 615, 1643, 640, 1643, 614, 1643, 617, 1640,
            612, 41146, 9213, 2221, 613
    };

    int[] BLUE = {
            9206, 4471, 609, 537, 609, 509, 636, 512, 606, 538, 608, 510, 634, 512, 608, 537, 604,
            515, 634, 1644, 609, 1646, 609, 1645, 636, 1646, 609, 511, 635, 1645, 608, 1645, 609,
            1645, 636, 511, 607, 1645, 637, 511, 607, 1645, 636, 511, 607, 537, 608, 511, 634, 511,
            607, 1645, 636, 512, 607, 1645, 633, 512, 608, 1645, 633, 1649, 608, 1645, 609, 1646,
            634, 41087, 9218, 2223, 611
    };

    int[] VIOLET_1 = {
            9192, 4475, 606, 534, 610, 508, 637, 509, 609, 534, 610, 508, 637, 511, 609, 537, 605,
            506, 639, 1640, 614, 1639, 613, 1640, 642, 1638, 614, 508, 637, 1640, 615, 1640, 612,
            1640, 641, 507, 612, 1640, 640, 1640, 612, 1642, 613, 537, 606, 510, 637, 508, 609, 533,
            612, 1639, 614, 536, 609, 509, 636, 507, 610, 1640, 641, 1638, 616, 1638, 616, 1640,
            640, 41082, 9188, 2221, 614
    };

    int[] VIOLET_2 = {
            9199, 4464, 613, 535, 610, 507, 637, 508, 621, 526, 607, 508, 640, 513, 604, 543, 599,
            516, 631, 1640, 611, 1643, 613, 1641, 641, 1639, 615, 508, 636, 1640, 614, 1641, 613,
            1642, 639, 507, 612, 1640, 640, 509, 605, 540, 608, 1640, 614, 535, 609, 509, 635, 509,
            610, 1641, 639, 508, 610, 1641, 640, 1641, 612, 508, 637, 1642, 612, 1641, 612, 1642,
            639, 41089, 9194, 2227, 609
    };

    int[] UNICORN = {
            9239, 4468, 616, 532, 616, 505, 643, 505, 614, 535, 613, 508, 637, 513, 612, 533, 615,
            506, 640, 1638, 619, 1642, 665, 1589, 645, 1639, 618, 506, 639, 1640, 619, 1640, 616,
            1639, 645, 508, 613, 1639, 645, 1638, 619, 507, 641, 1638, 620, 506, 641, 509, 667, 476,
            621, 1633, 621, 534, 615, 507, 641, 1640, 616, 538, 612, 1643, 614, 1640, 619, 1638, 646
    };
}
