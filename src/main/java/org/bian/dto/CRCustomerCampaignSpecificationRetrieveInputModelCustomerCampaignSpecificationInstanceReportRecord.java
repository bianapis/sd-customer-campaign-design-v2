package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCustomerCampaignSpecificationRetrieveInputModelCustomerCampaignSpecificationInstanceReportRecord
 */
public class CRCustomerCampaignSpecificationRetrieveInputModelCustomerCampaignSpecificationInstanceReportRecord   {
  private String customerCampaignSpecificationInstanceReportReference = null;

  private String customerCampaignSpecificationInstanceReportType = null;

  private String customerCampaignSpecificationInstanceReportParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return customerCampaignSpecificationInstanceReportReference
  **/

  public String getCustomerCampaignSpecificationInstanceReportReference() {
    return customerCampaignSpecificationInstanceReportReference;
  }

  public void setCustomerCampaignSpecificationInstanceReportReference(String customerCampaignSpecificationInstanceReportReference) {
    this.customerCampaignSpecificationInstanceReportReference = customerCampaignSpecificationInstanceReportReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return customerCampaignSpecificationInstanceReportType
  **/

  public String getCustomerCampaignSpecificationInstanceReportType() {
    return customerCampaignSpecificationInstanceReportType;
  }

  public void setCustomerCampaignSpecificationInstanceReportType(String customerCampaignSpecificationInstanceReportType) {
    this.customerCampaignSpecificationInstanceReportType = customerCampaignSpecificationInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return customerCampaignSpecificationInstanceReportParameters
  **/

  public String getCustomerCampaignSpecificationInstanceReportParameters() {
    return customerCampaignSpecificationInstanceReportParameters;
  }

  public void setCustomerCampaignSpecificationInstanceReportParameters(String customerCampaignSpecificationInstanceReportParameters) {
    this.customerCampaignSpecificationInstanceReportParameters = customerCampaignSpecificationInstanceReportParameters;
  }


}

