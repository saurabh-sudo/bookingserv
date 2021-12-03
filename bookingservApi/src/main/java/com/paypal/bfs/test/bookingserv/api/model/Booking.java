
package com.paypal.bfs.test.bookingserv.api.model;

import java.sql.Date;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;


/**
 * Booking resource
 * <p>
 * Booking resource object
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "first_name",
        "last_name",
        "date_of_birth",
        "checkin_datetime",
        "checkout_datetime",
        "totalprice",
        "deposit"
})
@Entity
@Table(name="Booking")
public class Booking {

    /**
     * Booking id
     *
     */
    @JsonProperty("id")
    @JsonPropertyDescription("Booking id")
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer id;
    /**
     * First name
     * (Required)
     *
     */
    @JsonProperty("first_name")
    @JsonPropertyDescription("First name")
    @NotBlank(message = "First name must not be blank!")
    private String firstName;
    /**
     * Last name
     * (Required)
     *
     */
    @JsonProperty("last_name")
    @JsonPropertyDescription("Last name")
    @NotBlank(message = "Last name must not be blank!")
    private String lastName;
    /**
     * Date of Birth
     * (Required)
     *
     */
    @JsonProperty("date_of_birth")
    @JsonPropertyDescription("Date of Birth")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @NotNull(message = "Please provide Date of Birth")
    private java.sql.Date dateOfBirth;
    /**
     * CheckIn Date
     * (Required)
     *
     */
    @JsonProperty("checkin_datetime")
    @JsonPropertyDescription("CheckIn Date")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @NotNull(message = "Please provide CheckIn Date")
    private java.sql.Date checkinDatetime;
    /**
     * Checkout Date
     * (Required)
     *
     */
    @JsonProperty("checkout_datetime")
    @JsonPropertyDescription("Checkout Date")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @NotNull(message = "Please provide CheckOut Date")
    private java.sql.Date checkoutDatetime;
    /**
     * Total Price
     * (Required)
     *
     */
    @JsonProperty("totalprice")
    @JsonPropertyDescription("Total Price")
    @NotNull
    private Integer totalprice;
    /**
     * Deposit
     * (Required)
     *
     */
    @JsonProperty("deposit")
    @JsonPropertyDescription("Deposit")
    @NotNull
    private Integer deposit;

    @Embedded
    @Valid
    private Address address;

    /**
     * Booking id
     *
     */
    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    /**
     * Booking id
     *
     */

    /**
     * First name
     * (Required)
     *
     */
    @JsonProperty("first_name")
    public String getFirstName() {
        return firstName;
    }

    /**
     * First name
     * (Required)
     *
     */
    @JsonProperty("first_name")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Last name
     * (Required)
     *
     */
    @JsonProperty("last_name")
    public String getLastName() {
        return lastName;
    }

    /**
     * Last name
     * (Required)
     *
     */
    @JsonProperty("last_name")
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Date getCheckinDatetime() {
        return checkinDatetime;
    }

    public void setCheckinDatetime(Date checkinDatetime) {
        this.checkinDatetime = checkinDatetime;
    }


    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    /**
     * Total Price
     * (Required)
     *
     */
    @JsonProperty("totalprice")
    public Integer getTotalprice() {
        return totalprice;
    }

    /**
     * Total Price
     * (Required)
     *
     */
    @JsonProperty("totalprice")
    public void setTotalprice(Integer totalprice) {
        this.totalprice = totalprice;
    }

    /**
     * Deposit
     * (Required)
     *
     */
    @JsonProperty("deposit")
    public Integer getDeposit() {
        return deposit;
    }

    /**
     * Deposit
     * (Required)
     *
     */
    @JsonProperty("deposit")
    public void setDeposit(Integer deposit) {
        this.deposit = deposit;
    }

    public Date getCheckoutDatetime() {
        return checkoutDatetime;
    }

    public void setCheckoutDatetime(Date checkoutDatetime) {
        this.checkoutDatetime = checkoutDatetime;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Booking.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("firstName");
        sb.append('=');
        sb.append(((this.firstName == null)?"<null>":this.firstName));
        sb.append(',');
        sb.append("lastName");
        sb.append('=');
        sb.append(((this.lastName == null)?"<null>":this.lastName));
        sb.append(',');
        sb.append("dateOfBirth");
        sb.append('=');
        sb.append(((this.dateOfBirth == null)?"<null>":this.dateOfBirth));
        sb.append(',');
        sb.append("checkinDatetime");
        sb.append('=');
        sb.append(((this.checkinDatetime == null)?"<null>":this.checkinDatetime));
        sb.append(',');
        sb.append("checkoutDatetime");
        sb.append('=');
        sb.append(((this.checkoutDatetime == null)?"<null>":this.checkoutDatetime));
        sb.append(',');
        sb.append("totalprice");
        sb.append('=');
        sb.append(((this.totalprice == null)?"<null>":this.totalprice));
        sb.append(',');
        sb.append("deposit");
        sb.append('=');
        sb.append(((this.deposit == null)?"<null>":this.deposit));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
