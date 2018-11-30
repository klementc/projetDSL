# projetDSL
Espace de rendu pour le projet du cours DSL (rennes1).
https://github.com/FAMILIAR-project/HackOurLanguages-SIF

# Informations
You need an installation of the following solvers in order to be able to use the features of this dsl:
MiniSat: http://minisat.se/
YalSat: http://sat2018.forsyte.tuwien.ac.at/solvers/main_and_glucose_hack/

# How To Use
Each solver class can give the evaluation of a formula either in DIMACS or in the DSLSAT format.
It prints yes and returns true if the formula is satisfiable, no and returns false otherwise.
The RandomDSLSATGenerator class can be used to generate formulas in the DSLSAT format. It is useful to benchmark or test the equivalence of the evaluation from different solvers with numerous different 
formulas.
The DSLSATSolverComparison class will compare the output of the 3 solvers implemented: minisat, yalsat and sat4j.

# Tests
There are examples of formula transformation, evaluation with the different solvers, and comparisons of results over random formulas in the DSLSatParsingTest Class
