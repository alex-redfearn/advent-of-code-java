# Day One - Secret Entrance

## Part One

The attached document (your puzzle input) contains a sequence of rotations, one per line, which tell you how to open the safe. 
A rotation starts with an L or R which indicates whether the rotation should be to the left (toward lower numbers) or to the right (toward higher numbers). 
Then, the rotation has a distance value which indicates how many clicks the dial should be rotated in that direction.

So, if the dial were pointing at 11, a rotation of R8 would cause the dial to point at 19. 
After that, a rotation of L19 would cause it to point at 0.

Turning the dial left from 0 one click makes it point at 99. 
Similarly, turning the dial right from 99 one click makes it point at 0.

The dial starts by pointing at 50.

Return the number of times the dial is left pointing at 0 after any rotation in the sequence.

### Example

The provided day one example input (see resources) should return a value of 3.

## Part 2

count the number of times any click causes the dial to point at 0, regardless of whether it happens during a rotation or at the end of one.

### Example

The provided day one example input (see resources) should now return a value of 6.


