package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerCampaignSpecificationCreateOutputModelCustomerCampaignSpecificationInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRCustomerCampaignSpecificationCreateOutputModel
 */
public class CRCustomerCampaignSpecificationCreateOutputModel   {
  private String customerCampaignSpecificationInstanceReference = null;

  private String customerCampaignSpecificationCreateActionReference = null;

  private Object customerCampaignSpecificationCreateActionRecord = null;

  private String customerCampaignSpecificationInstanceStatus = null;

  private CRCustomerCampaignSpecificationCreateOutputModelCustomerCampaignSpecificationInstanceRecord customerCampaignSpecificationInstanceRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Customer Campaign Specification instance 
   * @return customerCampaignSpecificationInstanceReference
  **/

  public String getCustomerCampaignSpecificationInstanceReference() {
    return customerCampaignSpecificationInstanceReference;
  }

  public void setCustomerCampaignSpecificationInstanceReference(String customerCampaignSpecificationInstanceReference) {
    this.customerCampaignSpecificationInstanceReference = customerCampaignSpecificationInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Create service call 
   * @return customerCampaignSpecificationCreateActionReference
  **/

  public String getCustomerCampaignSpecificationCreateActionReference() {
    return customerCampaignSpecificationCreateActionReference;
  }

  public void setCustomerCampaignSpecificationCreateActionReference(String customerCampaignSpecificationCreateActionReference) {
    this.customerCampaignSpecificationCreateActionReference = customerCampaignSpecificationCreateActionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Create service call input and output record 
   * @return customerCampaignSpecificationCreateActionRecord
  **/

  public Object getCustomerCampaignSpecificationCreateActionRecord() {
    return customerCampaignSpecificationCreateActionRecord;
  }

  public void setCustomerCampaignSpecificationCreateActionRecord(Object customerCampaignSpecificationCreateActionRecord) {
    this.customerCampaignSpecificationCreateActionRecord = customerCampaignSpecificationCreateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Customer Campaign Specification instance (e.g. initialised, pending, active) 
   * @return customerCampaignSpecificationInstanceStatus
  **/

  public String getCustomerCampaignSpecificationInstanceStatus() {
    return customerCampaignSpecificationInstanceStatus;
  }

  public void setCustomerCampaignSpecificationInstanceStatus(String customerCampaignSpecificationInstanceStatus) {
    this.customerCampaignSpecificationInstanceStatus = customerCampaignSpecificationInstanceStatus;
  }


  /**
   * Get customerCampaignSpecificationInstanceRecord
   * @return customerCampaignSpecificationInstanceRecord
  **/

  public CRCustomerCampaignSpecificationCreateOutputModelCustomerCampaignSpecificationInstanceRecord getCustomerCampaignSpecificationInstanceRecord() {
    return customerCampaignSpecificationInstanceRecord;
  }

  public void setCustomerCampaignSpecificationInstanceRecord(CRCustomerCampaignSpecificationCreateOutputModelCustomerCampaignSpecificationInstanceRecord customerCampaignSpecificationInstanceRecord) {
    this.customerCampaignSpecificationInstanceRecord = customerCampaignSpecificationInstanceRecord;
  }


}

