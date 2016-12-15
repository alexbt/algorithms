package com.alexbt.algos.string;

public class BoyerMoore {

    (1) Construire un tableau de suffix (savoir où se trouve les suffix dans le mot à chercher)
    
    (2) Comparer de droite à gauche
    
    (3) En cas de mismatch, sauter au suffix
    
    
    ABC ABCDAB ABCDABCDABDE
    ABCDABD

    i   Suffix Location
    0   -7
    1   -6
    2   -5
    3   -4
    4   -3
    5   2
    6   5
    
    char    Last Occurrence
    A   4
    B   5
    C   2
    D   6
}
