package com.sample.ds.graph;

import com.sample.ds.graph.domain.GraphNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GraphRunner
{

   static ArrayList<GraphNode> graphNodes ;

    public static void main(String[] args) {

        GraphRunner graphRunner = new GraphRunner();

        //create nodes.
        graphNodes  = new ArrayList<GraphNode>();
        graphNodes =  graphRunner.createStateGraphNode("NorthCarolina", graphNodes);
        graphNodes = graphRunner.createStateGraphNode("NewYork",graphNodes);
        graphNodes = graphRunner.createStateGraphNode("Washington",graphNodes);
        graphNodes = graphRunner.createStateGraphNode("Los Angeles",graphNodes);
        graphNodes = graphRunner.createStateGraphNode("Florida",graphNodes);

        System.out.println("graphNodes = "+ graphNodes.size());

        //Assign edges
        System.out.println("--------------->Linking NorthCarolina");
        GraphNode graphNodesVar =  graphRunner.assignStateLinks( "NorthCarolina" , "Washington" );
        System.out.println("graphNodesVar  add Washington to NC = "+ graphNodesVar.toString());
        GraphNode graphNodesVar2 = graphRunner.assignStateLinks("NorthCarolina" , "Los Angeles");
        System.out.println("graphNodesVar2  add L.A  to NC  = "+ graphNodesVar2.toString());

        System.out.println("--------------->Linking Washington");
        GraphNode graphNodesWashington =  graphRunner.assignStateLinks( "Washington" , "Florida" );
        System.out.println("graphNodesWashington  add Florida to Washington = "+ graphNodesWashington);

        System.out.println("--------------->Linking Los Angeles ");
        GraphNode graphNodesLA =  graphRunner.assignStateLinks( "Los Angeles" , "Washington" );
        System.out.println("graphNodesLA  add Washington to L.A = "+ graphNodesLA.toString());
        GraphNode graphNodesLA2 = graphRunner.assignStateLinks("Los Angeles" , "NewYork");
        System.out.println("graphNodesLA2  add NewYork to L.A  = "+ graphNodesLA2.toString());

        System.out.println("--------------->Linking New york");
        GraphNode graphNodesNy =  graphRunner.assignStateLinks( "NewYork" , "NorthCarolina" );
        System.out.println("graphNodesNy  add NorthCarolina to New york = "+ graphNodesNy.toString());
        GraphNode graphNodesNy2 = graphRunner.assignStateLinks("NewYork" , "Florida");
        System.out.println("graphNodesNy2  add Florida  to New york  = "+ graphNodesNy2.toString());

        System.out.println("--------------->Linking Florida");
        GraphNode graphNodesFlorida =  graphRunner.assignStateLinks( "Florida" , "Los Angeles" );
        System.out.println("graphNodesVar  add Los Angeles to Florida = "+ graphNodesFlorida.toString());

        //View the degrees for the given node .
        List<String> ncToStateList =  graphRunner.getStateDirections("NorthCarolina");
        System.out.println("ncToStateList <-----------> :"+ncToStateList.toString());
        List<String> nykToStateList =  graphRunner.getStateDirections("NewYork");
        System.out.println("nykToStateList <----------->  :"+nykToStateList.toString());
        List<String> FloridaToStateList =  graphRunner.getStateDirections("Florida");
        System.out.println("FloridaToStateList <----------->  :"+FloridaToStateList.toString());

        //Get the path's for the given node( state ) .
        graphRunner.getDestinationPathByStateName("NorthCarolina", "NewYork");

    }

        /*
        */
        public ArrayList<GraphNode> createStateGraphNode (String stateName,  ArrayList<GraphNode> graphNodes){
            System.out.println("Please create the node for the state : "+stateName);
            GraphNode graphNode = new GraphNode(stateName);
            graphNodes.add(graphNode);
            return graphNodes;
        }

    /*
     */
    public GraphNode assignStateLinks(String srcState,  String destState){
        System.out.println("Please assign the link between the source state : "+srcState+" , and destState : "+destState);
        //graphNodes.contains();
        List<String> stateName = new ArrayList<String>();
        for(GraphNode graphNodesVar : graphNodes){
            if(graphNodesVar.getStateName().equalsIgnoreCase(srcState)){
                System.out.println("Fetched the State  to link : "+srcState);

                if(graphNodesVar.getDirections() != null){
                    System.out.println("Exists States are :  "+graphNodesVar.getDirections());
                    stateName = graphNodesVar.getDirections();
                    stateName.add(destState);
                    graphNodesVar.setDirections(stateName);
                }else{
                    stateName.add(destState);
                    graphNodesVar.setDirections(stateName);
                }
                return  graphNodesVar;
            }
        }
        return null;
    }

    public List<String> getStateDirections(String srcState) {
        System.out.println("Get the stateDirections for the source state : " + srcState);
        //graphNodes.contains();
        List<String> stateName = new ArrayList<String>();
        for (GraphNode graphNodesVar : graphNodes) {
            if (graphNodesVar.getStateName().equalsIgnoreCase(srcState)) {
                System.out.println("Fetched the State  to getDirections : " + srcState);

                if (graphNodesVar.getDirections() != null) {
                    System.out.println("Exists States are :  " + graphNodesVar.getDirections());
                    return stateName = graphNodesVar.getDirections();
                }
            }
        }
        return null;
    }


    public String[] getDestinationPathByStateName(String sourceState , String destinationState){
        String[] paths = new String[10];
        for (GraphNode graphNodeVar : graphNodes){

            if(graphNodeVar.getStateName().equalsIgnoreCase(sourceState)){
                paths = getPathByState(null , graphNodeVar);
                System.out.println("retrieved path is :"+Arrays.asList(paths).toString());
            }

        }
        return  paths;

    }

    private String[]  getPathByState(List<String>  sourceState, GraphNode graphNodeVar2) {
        String[] paths = new String[10];
        List<String> directionsList = new ArrayList<String>();
        int counter = 1 ;
        if(sourceState != null){
            for(String directionsVar : sourceState) {
                for (GraphNode graphNodeVar : graphNodes) {
                    if (graphNodeVar.getStateName().equalsIgnoreCase(directionsVar)) {
                        if (graphNodeVar.getStateName().equalsIgnoreCase("NewYork")) {
                            paths[counter] = graphNodeVar.getStateName();
                            counter++;
                        return paths;
                    } else {
                             paths[counter] = graphNodeVar.getStateName();
                        directionsList = graphNodeVar.getDirections();
                        System.out.println("directionsList  in first else :"+directionsList.toString());
                        getPathByState(directionsList, null);
                        counter++;
                    }
                }
            }
        }
        }
        if(graphNodeVar2 != null){
            if (graphNodeVar2.getStateName().equalsIgnoreCase("NewYork")) {
                paths[0] = graphNodeVar2.getStateName();
                return paths;
            } else {
                paths[0] = graphNodeVar2.getStateName();
                directionsList = graphNodeVar2.getDirections();
                System.out.println("directionsList  in else :"+directionsList.toString());
                getPathByState(directionsList, null);
            }
        }
        return  paths;


    }
}