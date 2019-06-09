# skat-probability
Some probability calculation on the Skat game. Card game related source code was stolen directly from sbking.

## Probability of:

#### Buben split 1/1 between hand 2 and hand 3 GIVEN hand 1 and skat have 2 buben: ~53%
Reasoning: Give one Bube to one of hands 2 or 3. Now there are 19 remaining cards to deal: 9 of them will make 2 Buben in the same hand and 10 of them will split them, so split probability equals 10/19 = ~53%

#### Trump suit distribution probability GIVEN hand 1 and skat have 5 trumps (and 6 trumps remaining):
- 6/0: ~01%
- 5/1: ~13%
- 4/2: ~49%
- 3/3: ~37%

#### Non-Trump suit distribution probability GIVEN hand 1 and skat have 3 of that suit (and 4 cards remaining):
- 4/0: ~09%
- 3/1: ~49%
- 2/2: ~42%