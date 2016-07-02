package com.otms.newcomer.entity;

// consider using the following for date time
// import org.joda.time.LocalDateTimex

// basic java utilities
import java.util.Date;
import java.util.List;

/*
 * import java.util.List; 
 * import java.util.ArrayList;
 * import java.util.Set;
 * import java.util.HashSet;
 * import java.util.Locale;
 */
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
// import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
// import javax.persistence.JoinColumn;
// import javax.persistence.JoinTable;
// import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
// import javax.persistence.TableGenerator;
// import javax.persistence.Temporal;
// import javax.persistence.TemporalType;

@Entity
@Table(name="_order")
public class Order {
    public static void main(String[] args){
        System.out.println("Testing");
    }
    
    @Id
    @SequenceGenerator(name = "ord_id",                 // generator name
                       sequenceName = "seq_ord",        // sequence name
                       allocationSize = 1)              // sequence increase by 1 everytime; otherwise 50 to reduce the fequencey querying database
    @GeneratedValue(strategy = GenerationType.SEQUENCE,   // generator type
                    generator = "ord_id")                 // generator name
    
    /*@GeneratedValue(generator="ord_id",
                    strategy=GenerationType.TABLE)
    @TableGenerator(name="table_id_gen",            //策略生成器的名称  
                    table="t_id_gen",               //记录id的表名称  
                    pkColumnName="ID_COLUMN_NAME",  //用于存储指定表的标识，例如Order表，Location表等  
                    pkColumnValue="Order",          //field name
                    valueColumnName="NEXT_ID",      //存储下一条记录的id
                    allocationSize=1                //id增长的步进值  
    )*/
    //@GeneratedValue(strategy=GenerationType.AUTO)
    //@GeneratedValue(strategy=GenerationType.IDENTITY)
    
    @Column(name = "id",        // not necessary, if java field and database field name the same
            unique = true,      // not necessary, since @Id is used
            nullable = false)   // not necessary, since @Id is used
    private Long id;
    
    @Column(name = "ord_num",
            unique = true)
    private String ordNum;
    
    @Column(name = "client")
    private String client;
    
    @Column(name = "erp_num", nullable = false)
    private String erpNum;
    
    @Column(name = "pickup_date")
    private Date pickup_date;
    
    @Column(name = "delivery_date")
    private Date delivery_date;
    
    @Column(name = "act_pickup_date")
    private Date act_pickup_date;
    
    @Column(name = "act_delivery_date")
    private Date act_delivery_date;
    
    // fetch shipfrom object
    @OneToOne
    @JoinColumn(name = "shipfrom_loc")
    private Location shipfrom_loc;
    // fetch shipfrom id, both referring to the shipfrom_loc database field;
    @Column(name = "shipfrom_loc",
            insertable = false,
            updatable = false)
    private Long shipfrom_loc_id;
    
    // fetch shipto object
    @OneToOne
    @JoinColumn(name = "shipto_loc")
    private Location ship_from_2112;
    // fetch shipto id, both referring to the shipto_loc database field;
    @Column(name = "shipto_loc",
            insertable = false,
            updatable = false)
    private Long shipto_loc;
    
    @OneToMany(targetEntity = OrderLine.class, 
               mappedBy = "order",
               fetch = FetchType.EAGER)
    private List<OrderLine> orderLine;
    
    public Long getId() {
        return id;
    }
    // should have made this method private
    public void setId(Long id) {
        this.id = id;
    }

    public String getOrdNum() {
        return ordNum;
    }
    public void setOrdNum(String ordNum) {
        this.ordNum = ordNum;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public String getErpNum() {
        return erpNum;
    }

    public void setErpNum(String erpNum) {
        this.erpNum = erpNum;
    }

    public Date getPickup_date() {
        return pickup_date;
    }

    public void setPickup_date(Date pickup_date) {
        this.pickup_date = pickup_date;
    }

    public Date getDelivery_date() {
        return delivery_date;
    }

    public void setDelivery_date(Date delivery_date) {
        this.delivery_date = delivery_date;
    }

    public Date getAct_pickup_date() {
        return act_pickup_date;
    }

    public void setAct_pickup_date(Date act_pickup_date) {
        this.act_pickup_date = act_pickup_date;
    }

    public Date getAct_delivery_date() {
        return act_delivery_date;
    }

    public void setAct_delivery_date(Date act_delivery_date) {
        this.act_delivery_date = act_delivery_date;
    }

    public Location getShipfrom_loc() {
        return shipfrom_loc;
    }

    public void setShipfrom_loc(Location shipfrom_loc) {
        this.shipfrom_loc = shipfrom_loc;
    }

    public long getShipto_loc() {
        return shipto_loc;
    }

    public void setShipto_loc(long shipto_loc) {
        this.shipto_loc = shipto_loc;
    }
}
