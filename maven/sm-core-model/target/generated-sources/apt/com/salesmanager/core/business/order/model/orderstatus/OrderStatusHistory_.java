package com.salesmanager.core.business.order.model.orderstatus;

import com.salesmanager.core.business.order.model.Order;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(OrderStatusHistory.class)
public abstract class OrderStatusHistory_ {

	public static volatile SingularAttribute<OrderStatusHistory, String> comments;
	public static volatile SingularAttribute<OrderStatusHistory, Integer> customerNotified;
	public static volatile SingularAttribute<OrderStatusHistory, Long> id;
	public static volatile SingularAttribute<OrderStatusHistory, Date> dateAdded;
	public static volatile SingularAttribute<OrderStatusHistory, Order> order;
	public static volatile SingularAttribute<OrderStatusHistory, OrderStatus> status;

}

