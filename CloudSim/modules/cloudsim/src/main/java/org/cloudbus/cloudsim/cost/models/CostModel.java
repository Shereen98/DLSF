package org.cloudbus.cloudsim.cost.models;

import sun.security.x509.CertificatePolicySet;

/**
 * The CostModel interface needs to be implemented in order to provide a model of cost
 * of hosts, depending on utilization of a critical system component, such as CPU, RAM and network.
 *
 * @author Shreshth Tuli
 * @since CloudSim Toolkit 5.0
 */

public class CostModel {

    /** Cost per Bw **/
    private double costPerBw = 0;

    /** Cost per CPU time in seconds **/
    private double costPerCPUtime = 0;

    /** Cost per RAM usage **/
    private double costPerRam = 0;

    /**
     * Instantiates a new cost model.
     *
     * @param costPerBw cost per bandwidth
     * @param costPerCPUtime cost per cpu time
     * @param costPerRam cost per ram
     */
    public CostModel(
            double costPerBw,
            double costPerCPUtime,
            double costPerRam
    ){
        this.costPerBw = costPerBw;
        this.costPerCPUtime = costPerCPUtime;
        this.costPerRam = costPerRam;
    }

    /**
     * Gets cost to use each MegaBit of bandwidth
     * @return the cost to use bandwidth
     */
    protected double getCostPerBw(){
        return costPerBw;
    }

    /**
     * Gets cost to use CPU
     * @return the cost to use cpu
     */
    protected double getCostPerCPUtime(){
        return costPerCPUtime;
    }

    /**
     * Gets cost to use RAM
     * @return the cost to ram
     */
    protected double getCostPerRam(){
        return costPerRam;
    }

    /**
     * Sets cost to use each MegaBit of bandwidth
     * @param cost to use bandwidth
     */
    protected void setCostPerBw(double cost){
        this.costPerBw = cost;
    }

    /**
     * Sets cost to use cpu
     * @param cost to use cpu per hour
     */
    protected void setCostPerCPUTime(double cost){
        this.costPerCPUtime = cost;
    }

    /**
     * Sets cost to use RAM
     * @param cost to use ram
     */
    protected void setCostPerRam(double cost){
        this.costPerRam = cost;
    }
}