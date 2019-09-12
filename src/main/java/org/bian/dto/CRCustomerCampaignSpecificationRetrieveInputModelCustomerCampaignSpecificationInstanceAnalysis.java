package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCustomerCampaignSpecificationRetrieveInputModelCustomerCampaignSpecificationInstanceAnalysis
 */
public class CRCustomerCampaignSpecificationRetrieveInputModelCustomerCampaignSpecificationInstanceAnalysis   {
  private String customerCampaignSpecificationInstanceAnalysisReference = null;

  private String customerCampaignSpecificationInstanceAnalysisReportType = null;

  private String customerCampaignSpecificationInstanceAnalysisParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return customerCampaignSpecificationInstanceAnalysisReference
  **/

  public String getCustomerCampaignSpecificationInstanceAnalysisReference() {
    return customerCampaignSpecificationInstanceAnalysisReference;
  }

  public void setCustomerCampaignSpecificationInstanceAnalysisReference(String customerCampaignSpecificationInstanceAnalysisReference) {
    this.customerCampaignSpecificationInstanceAnalysisReference = customerCampaignSpecificationInstanceAnalysisReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return customerCampaignSpecificationInstanceAnalysisReportType
  **/

  public String getCustomerCampaignSpecificationInstanceAnalysisReportType() {
    return customerCampaignSpecificationInstanceAnalysisReportType;
  }

  public void setCustomerCampaignSpecificationInstanceAnalysisReportType(String customerCampaignSpecificationInstanceAnalysisReportType) {
    this.customerCampaignSpecificationInstanceAnalysisReportType = customerCampaignSpecificationInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return customerCampaignSpecificationInstanceAnalysisParameters
  **/

  public String getCustomerCampaignSpecificationInstanceAnalysisParameters() {
    return customerCampaignSpecificationInstanceAnalysisParameters;
  }

  public void setCustomerCampaignSpecificationInstanceAnalysisParameters(String customerCampaignSpecificationInstanceAnalysisParameters) {
    this.customerCampaignSpecificationInstanceAnalysisParameters = customerCampaignSpecificationInstanceAnalysisParameters;
  }


}

