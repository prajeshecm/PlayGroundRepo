package com.sample.ds.graph.domain;

import java.lang.reflect.Array;
import java.util.List;
import java.util.Objects;

public class GraphNode {

    protected String stateName ;
    protected List<String> directions ;

    public GraphNode(){}

    public GraphNode(String stateName){
        this.stateName = stateName;
    }


    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public List<String> getDirections() {
        return directions;
    }

    public void setDirections(List<String> directions) {
        this.directions = directions;
    }

    @Override
    public String toString() {
        return "GraphNode{" +
                "stateName='" + stateName + '\'' +
                ", directions=" + directions +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GraphNode graphNode = (GraphNode) o;
        return stateName.equals(graphNode.stateName) &&
                directions.equals(graphNode.directions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stateName, directions);
    }
}



