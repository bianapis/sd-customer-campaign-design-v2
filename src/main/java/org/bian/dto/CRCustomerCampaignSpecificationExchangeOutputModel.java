package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCustomerCampaignSpecificationExchangeOutputModel
 */
public class CRCustomerCampaignSpecificationExchangeOutputModel   {
  private String customerCampaignSpecificationExchangeActionTaskReference = null;

  private Object customerCampaignSpecificationExchangeActionTaskRecord = null;

  private String customerCampaignSpecificationExchangeActionResponse = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Customer Campaign Specification instance exchange service call 
   * @return customerCampaignSpecificationExchangeActionTaskReference
  **/

  public String getCustomerCampaignSpecificationExchangeActionTaskReference() {
    return customerCampaignSpecificationExchangeActionTaskReference;
  }

  public void setCustomerCampaignSpecificationExchangeActionTaskReference(String customerCampaignSpecificationExchangeActionTaskReference) {
    this.customerCampaignSpecificationExchangeActionTaskReference = customerCampaignSpecificationExchangeActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response 
   * @return customerCampaignSpecificationExchangeActionResponse
  **/

  public String getCustomerCampaignSpecificationExchangeActionResponse() {
    return customerCampaignSpecificationExchangeActionResponse;
  }

  public void setCustomerCampaignSpecificationExchangeActionResponse(String customerCampaignSpecificationExchangeActionResponse) {
    this.customerCampaignSpecificationExchangeActionResponse = customerCampaignSpecificationExchangeActionResponse;
  }


}

