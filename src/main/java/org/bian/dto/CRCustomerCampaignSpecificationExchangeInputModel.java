package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerCampaignSpecificationExchangeInputModelCustomerCampaignSpecificationExchangeActionRequest;

import javax.validation.Valid;
  
/**
 * CRCustomerCampaignSpecificationExchangeInputModel
 */
public class CRCustomerCampaignSpecificationExchangeInputModel   {
  private String customerCampaignDesignServicingSessionReference = null;

  private String customerCampaignSpecificationInstanceReference = null;

  private Object customerCampaignSpecificationExchangeActionTaskRecord = null;

  private CRCustomerCampaignSpecificationExchangeInputModelCustomerCampaignSpecificationExchangeActionRequest customerCampaignSpecificationExchangeActionRequest = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return customerCampaignSpecificationExchangeActionTaskRecord
  **/

  public Object getCustomerCampaignSpecificationExchangeActionTaskRecord() {
    return customerCampaignSpecificationExchangeActionTaskRecord;
  }

  public void setCustomerCampaignSpecificationExchangeActionTaskRecord(Object customerCampaignSpecificationExchangeActionTaskRecord) {
    this.customerCampaignSpecificationExchangeActionTaskRecord = customerCampaignSpecificationExchangeActionTaskRecord;
  }


  /**
   * Get customerCampaignSpecificationExchangeActionRequest
   * @return customerCampaignSpecificationExchangeActionRequest
  **/

  public CRCustomerCampaignSpecificationExchangeInputModelCustomerCampaignSpecificationExchangeActionRequest getCustomerCampaignSpecificationExchangeActionRequest() {
    return customerCampaignSpecificationExchangeActionRequest;
  }

  public void setCustomerCampaignSpecificationExchangeActionRequest(CRCustomerCampaignSpecificationExchangeInputModelCustomerCampaignSpecificationExchangeActionRequest customerCampaignSpecificationExchangeActionRequest) {
    this.customerCampaignSpecificationExchangeActionRequest = customerCampaignSpecificationExchangeActionRequest;
  }


}

