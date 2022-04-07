install.packages("igraph")
library(igraph)

#To Create a graph network
g = graph.formula(a-b, b-c, c-d, d-e, e-f, f-g, g-h) 
g

#No. of edges
ecount(g)

#No.of vertices
vcount(g)

#List of edges
E(g)

#List of vertices
V(g)

#Degree of the graph
degree(g)

#To concatenate 2 different functions together
V(g)$name[degree(g) == min(degree(g))]

