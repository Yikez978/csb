package subgraphIso;

import org.neo4j.graphdb.Node;
/**
 * The Result class defines the output to the Cypher console
 * Use ONLY String and Node for instance variable!!
 * Other object types may cause Neo4j server start failure
 *
 * The instance variables will be posted into different columns
 * e.g., in the Cypher console, four columns will be created for the returned results: resultNode, queryNode, index and totalNumSubgraph
 *
 * resultNode: a node in the matching subgraph
 * queryNode: a node in the query graph
 * subgraphIndex: which subgraph does the resultNode belong to
 * totalNumSubgraph: the total number of subgraphs
 */

public class Result {

    public String resultNodeID;
    public String queryNodeID;
    public String subgraphIndex;
    public String totalNumSubgraph;
   // public String executionTime;

    public Result(Node resultNode, Node queryNode, String subgraphIndex,int totalNumSubgraph) {
        this.resultNodeID = String.valueOf(resultNode.getId());
        this.queryNodeID = String.valueOf(queryNode.getId());
        this.subgraphIndex = subgraphIndex;
        this.totalNumSubgraph=Integer.toString(totalNumSubgraph);
        //this.executionTime=executionTime;
    }
}


