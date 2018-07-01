package com.salesmanager.core.business.catalog.category.model;

import com.salesmanager.core.business.common.model.audit.AuditSection;
import com.salesmanager.core.business.merchant.model.MerchantStore;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Category.class)
public abstract class Category_ {

	public static volatile SingularAttribute<Category, String> lineage;
	public static volatile SingularAttribute<Category, Category> parent;
	public static volatile SingularAttribute<Category, Boolean> visible;
	public static volatile SingularAttribute<Category, String> code;
	public static volatile SingularAttribute<Category, String> categoryImage;
	public static volatile SingularAttribute<Category, AuditSection> auditSection;
	public static volatile ListAttribute<Category, CategoryDescription> descriptions;
	public static volatile SingularAttribute<Category, Integer> depth;
	public static volatile SingularAttribute<Category, Integer> sortOrder;
	public static volatile SingularAttribute<Category, Boolean> categoryStatus;
	public static volatile SingularAttribute<Category, Long> id;
	public static volatile ListAttribute<Category, Category> categories;
	public static volatile SingularAttribute<Category, MerchantStore> merchantStore;

}

