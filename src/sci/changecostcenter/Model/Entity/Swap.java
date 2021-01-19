package sci.changecostcenter.Model.Entity;

import fileManager.StringFilter;
import java.math.BigDecimal;
import java.math.RoundingMode;
import static sci.changecostcenter.Model.Entity.CostCenter.TYPE_CREDIT;
import static sci.changecostcenter.Model.Entity.CostCenter.TYPE_DEBIT;
import static sci.changecostcenter.SCIChangeCostCenter.ini;

public class Swap {

    //Filtros
    private Integer enterprise = Integer.valueOf(ini.get("Config", "enterprise"));
    private Integer accountCreditOrDebit = null;
    private Integer accountCredit = null;
    private Integer accountDebit = null;
    private Integer participantCredit = null;
    private Integer participantDebit = null;
    private Integer descriptionCode = null;
    private StringFilter complementFilter = null;
    private String document = null;
    private BigDecimal valueFilter = null;

    //To CC
    private BigDecimal value = null;
    private BigDecimal percent = null;
    
    private Integer costCenterCredit = null;
    private Integer costCenterDebit = null;
    private Integer costCenter = null;
    private Integer valueType = null;
    private Integer account = null;

    public Integer getAccount() {
        return account;
    }

    public Integer getCostCenter() {
        return costCenter;
    }

    public Integer getValueType() {
        return valueType;
    }

    public void setValueFilter(BigDecimal valueFilter) {
        this.valueFilter = valueFilter;
    }

    public BigDecimal getValueFilter() {
        return valueFilter;
    }

    public Integer getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(Integer enterprise) {
        this.enterprise = enterprise;
    }

    public BigDecimal getPercent() {
        return percent;
    }

    public void setPercent(BigDecimal percent) {
        this.percent = percent;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value.setScale(2, RoundingMode.HALF_DOWN);
    }

    public Integer getAccountCreditOrDebit() {
        return accountCreditOrDebit;
    }

    public void setAccountCreditOrDebit(Integer accountCreditOrDebit) {
        account = accountCreditOrDebit;
        this.accountCreditOrDebit = accountCreditOrDebit;
    }

    public Integer getAccountCredit() {
        return accountCredit;
    }

    public void setAccountCredit(Integer accountCredit) {
        account = accountCredit;
        this.accountCredit = accountCredit;
    }

    public Integer getAccountDebit() {
        return accountDebit;
    }

    public void setAccountDebit(Integer accountDebit) {
        account = accountDebit;
        this.accountDebit = accountDebit;
    }

    public Integer getParticipantCredit() {
        return participantCredit;
    }

    public void setParticipantCredit(Integer participantCredit) {
        this.participantCredit = participantCredit;
    }

    public Integer getParticipantDebit() {
        return participantDebit;
    }

    public void setParticipantDebit(Integer participantDebit) {
        this.participantDebit = participantDebit;
    }

    public Integer getDescriptionCode() {
        return descriptionCode;
    }

    public void setDescriptionCode(Integer descriptionCode) {
        this.descriptionCode = descriptionCode;
    }

    public Integer getCostCenterCredit() {
        return costCenterCredit;
    }

    public void setCostCenterCredit(Integer costCenterCredit) {
        costCenter = costCenterCredit;
        valueType = TYPE_CREDIT;
        this.costCenterCredit = costCenterCredit;
    }

    public Integer getCostCenterDebit() {
        return costCenterDebit;
    }

    public void setCostCenterDebit(Integer costCenterDebit) {
        costCenter = costCenterDebit;
        valueType = TYPE_DEBIT;
        this.costCenterDebit = costCenterDebit;
    }

    public StringFilter getComplementFilter() {
        return complementFilter;
    }

    public void setComplementFilter(StringFilter complementFilter) {
        this.complementFilter = complementFilter;
    }
}
