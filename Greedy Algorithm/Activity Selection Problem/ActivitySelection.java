/*
    ProblemStatement:
    Given a data related to n different activities. An activity means start and finish time together you
    are given 2 Arrays start,finish of size n represents start and finish time of n activities. start[i]
    and finish[i] represents the start and finish time of ith activity. There is a person whose suppose 
    to perform these activities. The person can always perform only one activity at a time that to be start
    time > finish time of last choosen activity. Now find the maximum number of activities the person can
    perform without overlapping.
    Input:
    n = 6
    start[] = [1,3,0,5,8,5]
    finish[] = [2,4,6,7,9,9]
    Output:
    4
    TimeComplexity:O(nlogn)
    SpaceComplexity:O(1)    
*/
