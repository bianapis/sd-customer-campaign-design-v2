package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCustomerCampaignSpecificationControlOutputModel
 */
public class CRCustomerCampaignSpecificationControlOutputModel   {
  private String customerCampaignSpecificationControlActionTaskReference = null;

  private Object customerCampaignSpecificationControlActionTaskRecord = null;

  private String customerCampaignSpecificationControlActionResponse = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Customer Campaign Specification instance control processing service call 
   * @return customerCampaignSpecificationControlActionTaskReference
  **/

  public String getCustomerCampaignSpecificationControlActionTaskReference() {
    return customerCampaignSpecificationControlActionTaskReference;
  }

  public void setCustomerCampaignSpecificationControlActionTaskReference(String customerCampaignSpecificationControlActionTaskReference) {
    this.customerCampaignSpecificationControlActionTaskReference = customerCampaignSpecificationControlActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The processing control service call consolidated processing record 
   * @return customerCampaignSpecificationControlActionTaskRecord
  **/

  public Object getCustomerCampaignSpecificationControlActionTaskRecord() {
    return customerCampaignSpecificationControlActionTaskRecord;
  }

  public void setCustomerCampaignSpecificationControlActionTaskRecord(Object customerCampaignSpecificationControlActionTaskRecord) {
    this.customerCampaignSpecificationControlActionTaskRecord = customerCampaignSpecificationControlActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the control action service response 
   * @return customerCampaignSpecificationControlActionResponse
  **/

  public String getCustomerCampaignSpecificationControlActionResponse() {
    return customerCampaignSpecificationControlActionResponse;
  }

  public void setCustomerCampaignSpecificationControlActionResponse(String customerCampaignSpecificationControlActionResponse) {
    this.customerCampaignSpecificationControlActionResponse = customerCampaignSpecificationControlActionResponse;
  }


}

