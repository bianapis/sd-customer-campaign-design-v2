package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerCampaignSpecificationCreateInputModelCustomerCampaignSpecificationInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRCustomerCampaignSpecificationCreateInputModel
 */
public class CRCustomerCampaignSpecificationCreateInputModel   {
  private String customerCampaignDesignServicingSessionReference = null;

  private Object customerCampaignSpecificationCreateActionRecord = null;

  private String customerCampaignSpecificationInstanceStatus = null;

  private CRCustomerCampaignSpecificationCreateInputModelCustomerCampaignSpecificationInstanceRecord customerCampaignSpecificationInstanceRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return customerCampaignDesignServicingSessionReference
  **/

  public String getCustomerCampaignDesignServicingSessionReference() {
    return customerCampaignDesignServicingSessionReference;
  }

  public void setCustomerCampaignDesignServicingSessionReference(String customerCampaignDesignServicingSessionReference) {
    this.customerCampaignDesignServicingSessionReference = customerCampaignDesignServicingSessionReference;
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

  public CRCustomerCampaignSpecificationCreateInputModelCustomerCampaignSpecificationInstanceRecord getCustomerCampaignSpecificationInstanceRecord() {
    return customerCampaignSpecificationInstanceRecord;
  }

  public void setCustomerCampaignSpecificationInstanceRecord(CRCustomerCampaignSpecificationCreateInputModelCustomerCampaignSpecificationInstanceRecord customerCampaignSpecificationInstanceRecord) {
    this.customerCampaignSpecificationInstanceRecord = customerCampaignSpecificationInstanceRecord;
  }


}

