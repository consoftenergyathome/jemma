/**
 * This file is part of JEMMA - http://jemma.energy-home.org
 * (C) Copyright 2013 Telecom Italia (http://www.telecomitalia.it)
 *
 * JEMMA is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License (LGPL) version 3
 * or later as published by the Free Software Foundation, which accompanies
 * this distribution and is available at http://www.gnu.org/licenses/lgpl.html
 *
 * JEMMA is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License (LGPL) for more details.
 *
 */
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1.9-03/31/2009 04:14 PM(snajper)-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.04.03 at 05:23:14 PM CEST 
//


package org.energy_home.jemma.zgd.jaxb;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DescriptorCapability complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DescriptorCapability">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ExtendedActiveEndpointListAvailable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ExtendedSimpleDescriptorListAvailable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DescriptorCapability", propOrder = {
    "extendedActiveEndpointListAvailable",
    "extendedSimpleDescriptorListAvailable"
})
public class DescriptorCapability implements Serializable {

    @XmlElement(name = "ExtendedActiveEndpointListAvailable")
    protected boolean extendedActiveEndpointListAvailable;
    @XmlElement(name = "ExtendedSimpleDescriptorListAvailable")
    protected boolean extendedSimpleDescriptorListAvailable;

    /**
     * Gets the value of the extendedActiveEndpointListAvailable property.
     * 
     */
    public boolean isExtendedActiveEndpointListAvailable() {
        return extendedActiveEndpointListAvailable;
    }

    /**
     * Sets the value of the extendedActiveEndpointListAvailable property.
     * 
     */
    public void setExtendedActiveEndpointListAvailable(boolean value) {
        this.extendedActiveEndpointListAvailable = value;
    }

    /**
     * Gets the value of the extendedSimpleDescriptorListAvailable property.
     * 
     */
    public boolean isExtendedSimpleDescriptorListAvailable() {
        return extendedSimpleDescriptorListAvailable;
    }

    /**
     * Sets the value of the extendedSimpleDescriptorListAvailable property.
     * 
     */
    public void setExtendedSimpleDescriptorListAvailable(boolean value) {
        this.extendedSimpleDescriptorListAvailable = value;
    }

}
