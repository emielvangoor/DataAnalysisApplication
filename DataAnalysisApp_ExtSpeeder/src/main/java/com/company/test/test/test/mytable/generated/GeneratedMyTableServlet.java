package com.company.test.test.test.mytable.generated;

import com.company.test.test.test.mytable.MyTable;
import com.speedment.plugin.extspeeder.runtime.FieldMapper;
import com.speedment.plugin.extspeeder.runtime.servlet.ExtSpeederHttpServlet;
import javax.annotation.Generated;
import static com.speedment.encoder.JsonEncoder.jsonValue;

/**
 * The generated servlet representing an entity (for example, a row) in the
 * Table test.test.test.myTable.
 * <p>
 * This file has been automatically generated by Ext Speeder. Any changes
 * made to it will be overwritten.
 * 
 * @author Ext Speeder
 */
@Generated("Ext Speeder")
public class GeneratedMyTableServlet extends ExtSpeederHttpServlet<MyTable> {
    
    private final static long serialVersionUID = 1985908184;
    public static FieldMapper<MyTable> FIELD_MAPPER = columnName -> {
            switch (columnName) {
                case "id" : return MyTable.ID;
                case "value" : return MyTable.VALUE;
                case "date" : return MyTable.DATE;
                case "person" : return MyTable.PERSON;
                case "country" : return MyTable.COUNTRY;
                case "company" : return MyTable.COMPANY;
                case "quantity" : return MyTable.QUANTITY;
                default : return null;
            }
    };
    
    @Override
    public Class<MyTable> entityClass() {
        return MyTable.class;
    }
    
    @Override
    public FieldMapper<MyTable> fieldMapper() {
        return FIELD_MAPPER;
    }
    
    @Override
    public String toJson(MyTable entity) {
        return entity == null ? "null" : new StringBuilder()
            .append('{')
            .append("\"id\":").append(jsonValue(entity.getId())).append(", ")
            .append("\"value\":").append(jsonValue(entity.getValue())).append(", ")
            .append("\"date\":").append(jsonValue(entity.getDate())).append(", ")
            .append("\"person\":").append(jsonValue(entity.getPerson())).append(", ")
            .append("\"country\":").append(jsonValue(entity.getCountry())).append(", ")
            .append("\"company\":").append(jsonValue(entity.getCompany())).append(", ")
            .append("\"quantity\":").append(jsonValue(entity.getQuantity()))
            .append('}')
        .toString();
    }
    
    @Override
    public String getServletInfo() {
        return "Servlet for the myTable table in the test schema.";
    }
}