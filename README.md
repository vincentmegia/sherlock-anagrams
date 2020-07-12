This is really abit of a puzzler to me simply because permutation and combination problem are still new to me,
what the problem really is to count the no. of frequencies an anagram can appear to a subset of a string.
Let's take this for example

cdcd where the permutations below

c
cd
cdc
cdcd
d
dc
dcd
c
cd
d

the approach is to build a Map<String, Integer> that would keep track of count of frequencies.
After building the map we will apply the count using this formula i've derived

((n*(n+1))/2) -n; //where n is the frequency.

At first this is very daunting but once understood it's really that simple.