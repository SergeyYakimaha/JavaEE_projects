package com.service;

import javax.persistence.criteria.Order;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.List;

@XmlRootElement(name="orders")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderList", propOrder = {"orders"})
public class OrderServiceImpl {

    @GET
    @Path("order/{id}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<Order> getOrdertList(@PathParam("id") int id) {
        College college = new College();
        return college.gerStudentById(id);
    }
}
