package org.xdi.oxd.licenser.server.conf;

import org.codehaus.jackson.annotate.JsonProperty;

import java.io.Serializable;

/**
 * @author Yuriy Zabrovarnyy
 * @version 0.9, 23/09/2014
 */

public class Configuration implements Serializable {

    @JsonProperty(value = "base-dn")
    private String baseDn;
    @JsonProperty(value = "thread-number-paid-license")
    private Integer threadNumberPaidLicense;
    @JsonProperty(value = "thread-number-premium-license")
    private Integer threadNumberPremiumLicense;
    @JsonProperty(value = "customer-base-dn")
    private String customerBaseDn;

    public Configuration() {
    }

    public String getCustomerBaseDn() {
        return customerBaseDn;
    }

    public void setCustomerBaseDn(String customerBaseDn) {
        this.customerBaseDn = customerBaseDn;
    }

    public String getBaseDn() {
        return baseDn;
    }

    public void setBaseDn(String baseDn) {
        this.baseDn = baseDn;
    }

    public Integer getThreadNumberPaidLicense() {
        return threadNumberPaidLicense;
    }

    public void setThreadNumberPaidLicense(Integer threadNumberPaidLicense) {
        this.threadNumberPaidLicense = threadNumberPaidLicense;
    }

    public Integer getThreadNumberPremiumLicense() {
        return threadNumberPremiumLicense;
    }

    public void setThreadNumberPremiumLicense(Integer threadNumberPremiumLicense) {
        this.threadNumberPremiumLicense = threadNumberPremiumLicense;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Configuration");
        sb.append("{baseDn='").append(baseDn).append('\'');
        sb.append(", threadNumberPaidLicense=").append(threadNumberPaidLicense);
        sb.append(", threadNumberPremiumLicense=").append(threadNumberPremiumLicense);
        sb.append('}');
        return sb.toString();
    }
}
