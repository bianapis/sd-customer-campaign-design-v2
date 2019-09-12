package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCustomerCampaignSpecificationCreateOutputModelCustomerCampaignSpecificationInstanceRecordCustomerCampaignSpecificationCustomerCampaignConsumables
 */
public class CRCustomerCampaignSpecificationCreateOutputModelCustomerCampaignSpecificationInstanceRecordCustomerCampaignSpecificationCustomerCampaignConsumables   {
  private String customerCampaignConsumableType = null;

  private String customerCampaignConsumableDescription = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of consumable item associated with the campaign (e.g. gift, brochure) 
   * @return customerCampaignConsumableType
  **/

  public String getCustomerCampaignConsumableType() {
    return customerCampaignConsumableType;
  }

  public void setCustomerCampaignConsumableType(String customerCampaignConsumableType) {
    this.customerCampaignConsumableType = customerCampaignConsumableType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The specification of the consumable item in whatever form appropriate. Note sourcing/procurement of the item is handled by execution) 
   * @return customerCampaignConsumableDescription
  **/

  public String getCustomerCampaignConsumableDescription() {
    return customerCampaignConsumableDescription;
  }

  public void setCustomerCampaignConsumableDescription(String customerCampaignConsumableDescription) {
    this.customerCampaignConsumableDescription = customerCampaignConsumableDescription;
  }


}

