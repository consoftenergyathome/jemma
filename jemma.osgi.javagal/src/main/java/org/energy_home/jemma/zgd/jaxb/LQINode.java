//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1.9-03/31/2009 04:14 PM(snajper)-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.12.13 at 03:45:34 PM CET 
//


package org.energy_home.jemma.zgd.jaxb;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LQINode complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LQINode">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NodeAddress" type="{http://www.zigbee.org/GWGSchema}IeeeAddress"/>
 *         &lt;element name="NeighborList" type="{http://www.zigbee.org/GWGSchema}NeighborList"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LQINode", propOrder = {
    "nodeAddress",
    "neighborList"
})
public class LQINode {

    @XmlElement(name = "NodeAddress", required = true)
    protected BigInteger nodeAddress;
    @XmlElement(name = "NeighborList", required = true)
    protected NeighborList neighborList;

    /**
     * Gets the value of the nodeAddress property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNodeAddress() {
        return nodeAddress;
    }

    /**
     * Sets the value of the nodeAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNodeAddress(BigInteger value) {
        this.nodeAddress = value;
    }

    /**
     * Gets the value of the neighborList property.
     * 
     * @return
     *     possible object is
     *     {@link NeighborList }
     *     
     */
    public NeighborList getNeighborList() {
        return neighborList;
    }

    /**
     * Sets the value of the neighborList property.
     * 
     * @param value
     *     allowed object is
     *     {@link NeighborList }
     *     
     */
    public void setNeighborList(NeighborList value) {
        this.neighborList = value;
    }

}
