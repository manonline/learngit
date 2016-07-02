package com.otms.newcomer.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "ord_line")
@SequenceGenerator(name = "ord_line_id",
                   sequenceName = "seq_ord_line",
                   allocationSize = 1)
public class OrderLine {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
                    generator = "ord_line_id")
    private Long id;
    
    @ManyToOne(optional = false)                // optional = true : left outer join, optional = false : inner join;
    @JoinColumn(name = "order_id",              // name : column name in the current table
                referencedColumnName = "id")    // referencedColumnName : column name in the target table;
    private Order order;
    
    @Column(name = "line")
    private Long lineNum;
    
    @Column(name = "item")
    private String item;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Long getLineNum() {
        return lineNum;
    }

    public void setLineNum(Long lineNum) {
        this.lineNum = lineNum;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }
}
