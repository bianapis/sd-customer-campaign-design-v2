package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCustomerCampaignSpecificationCreateOutputModelCustomerCampaignSpecificationInstanceRecordCustomerCampaignSpecificationCustomerCampaignExecutionGuidelines
 */
public class CRCustomerCampaignSpecificationCreateOutputModelCustomerCampaignSpecificationInstanceRecordCustomerCampaignSpecificationCustomerCampaignExecutionGuidelines   {
  private String customerCampaignEligibility = null;

  private String customerCampaignQualifications = null;

  private String customerCampaignInteractionGuide = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Defines the eligibility criteria that are to be applied to select suitable candidates for the customer campaign. (Note candidate lists are developed by Campaign Execution) 
   * @return customerCampaignEligibility
  **/

  public String getCustomerCampaignEligibility() {
    return customerCampaignEligibility;
  }

  public void setCustomerCampaignEligibility(String customerCampaignEligibility) {
    this.customerCampaignEligibility = customerCampaignEligibility;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Defines any qualifications or credentials required of the bank unit or employees to execute the campaign (e.g. product certified, sign-off authority level) 
   * @return customerCampaignQualifications
  **/

  public String getCustomerCampaignQualifications() {
    return customerCampaignQualifications;
  }

  public void setCustomerCampaignQualifications(String customerCampaignQualifications) {
    this.customerCampaignQualifications = customerCampaignQualifications;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Provides the structured narrative and any pricing/negotiating frameworks that are used in the execution of the campaign 
   * @return customerCampaignInteractionGuide
  **/

  public String getCustomerCampaignInteractionGuide() {
    return customerCampaignInteractionGuide;
  }

  public void setCustomerCampaignInteractionGuide(String customerCampaignInteractionGuide) {
    this.customerCampaignInteractionGuide = customerCampaignInteractionGuide;
  }


}

