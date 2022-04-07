library(igraph)
ng<-graph.formula(Andy++Garth,Garth-+Bill,Bill-
                    +Elena,Elena++Frank,Carol-+Andy,Carol-
                    +Elena,Carol++Dan,Carol++Bill,Dan++Andy,Dan++Bill)
plot(ng)
get.adjacency(ng)
E(ng)
get.adjedgelist(ng,mode="in")
