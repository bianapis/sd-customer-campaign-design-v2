package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCustomerCampaignSpecificationCreateOutputModelCustomerCampaignSpecificationInstanceRecordCustomerCampaignSpecificationCustomerCampaignProductServiceUsage
 */
public class CRCustomerCampaignSpecificationCreateOutputModelCustomerCampaignSpecificationInstanceRecordCustomerCampaignSpecificationCustomerCampaignProductServiceUsage   {
  private String customerCampaignProductServiceType = null;

  private String productServiceCampaignEngagementDescription = null;

  private String productServiceCampaignTransferPricingArrangement = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type or category of product or service included in the campaign (e.g. current account) 
   * @return customerCampaignProductServiceType
  **/

  public String getCustomerCampaignProductServiceType() {
    return customerCampaignProductServiceType;
  }

  public void setCustomerCampaignProductServiceType(String customerCampaignProductServiceType) {
    this.customerCampaignProductServiceType = customerCampaignProductServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A description of how the product or service is adapted in the context of the campaign (e.g. discounted pricing/preferential rates, waived service fees, gifts or incentives) 
   * @return productServiceCampaignEngagementDescription
  **/

  public String getProductServiceCampaignEngagementDescription() {
    return productServiceCampaignEngagementDescription;
  }

  public void setProductServiceCampaignEngagementDescription(String productServiceCampaignEngagementDescription) {
    this.productServiceCampaignEngagementDescription = productServiceCampaignEngagementDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Describes how any discounted costs are to be accounted for by the product fulfillment function (e.g. borne by fulfillment business unit, compensated by campaign budget) 
   * @return productServiceCampaignTransferPricingArrangement
  **/

  public String getProductServiceCampaignTransferPricingArrangement() {
    return productServiceCampaignTransferPricingArrangement;
  }

  public void setProductServiceCampaignTransferPricingArrangement(String productServiceCampaignTransferPricingArrangement) {
    this.productServiceCampaignTransferPricingArrangement = productServiceCampaignTransferPricingArrangement;
  }


}

