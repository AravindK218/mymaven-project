package com.salesmanager.core.business.common.model.audit;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(AuditSection.class)
public abstract class AuditSection_ {

	public static volatile SingularAttribute<AuditSection, Date> dateCreated;
	public static volatile SingularAttribute<AuditSection, Date> dateModified;
	public static volatile SingularAttribute<AuditSection, String> modifiedBy;

}

