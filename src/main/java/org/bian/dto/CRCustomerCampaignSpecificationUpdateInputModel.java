package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerCampaignSpecificationUpdateInputModelCustomerCampaignSpecificationInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRCustomerCampaignSpecificationUpdateInputModel
 */
public class CRCustomerCampaignSpecificationUpdateInputModel   {
  private String customerCampaignDesignServicingSessionReference = null;

  private String customerCampaignSpecificationInstanceReference = null;

  private CRCustomerCampaignSpecificationUpdateInputModelCustomerCampaignSpecificationInstanceRecord customerCampaignSpecificationInstanceRecord = null;

  private Object customerCampaignSpecificationUpdateActionTaskRecord = null;

  private String updateActionRequest = null;


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
   * Get customerCampaignSpecificationInstanceRecord
   * @return customerCampaignSpecificationInstanceRecord
  **/

  public CRCustomerCampaignSpecificationUpdateInputModelCustomerCampaignSpecificationInstanceRecord getCustomerCampaignSpecificationInstanceRecord() {
    return customerCampaignSpecificationInstanceRecord;
  }

  public void setCustomerCampaignSpecificationInstanceRecord(CRCustomerCampaignSpecificationUpdateInputModelCustomerCampaignSpecificationInstanceRecord customerCampaignSpecificationInstanceRecord) {
    this.customerCampaignSpecificationInstanceRecord = customerCampaignSpecificationInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return customerCampaignSpecificationUpdateActionTaskRecord
  **/

  public Object getCustomerCampaignSpecificationUpdateActionTaskRecord() {
    return customerCampaignSpecificationUpdateActionTaskRecord;
  }

  public void setCustomerCampaignSpecificationUpdateActionTaskRecord(Object customerCampaignSpecificationUpdateActionTaskRecord) {
    this.customerCampaignSpecificationUpdateActionTaskRecord = customerCampaignSpecificationUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return updateActionRequest
  **/

  public String getUpdateActionRequest() {
    return updateActionRequest;
  }

  public void setUpdateActionRequest(String updateActionRequest) {
    this.updateActionRequest = updateActionRequest;
  }


}

