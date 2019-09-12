package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCustomerCampaignSpecificationRetrieveOutputModelCustomerCampaignSpecificationInstanceAnalysis
 */
public class CRCustomerCampaignSpecificationRetrieveOutputModelCustomerCampaignSpecificationInstanceAnalysis   {
  private String customerCampaignSpecificationInstanceAnalysisData = null;

  private String customerCampaignSpecificationInstanceAnalysisReportType = null;

  private Object customerCampaignSpecificationInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return customerCampaignSpecificationInstanceAnalysisData
  **/

  public String getCustomerCampaignSpecificationInstanceAnalysisData() {
    return customerCampaignSpecificationInstanceAnalysisData;
  }

  public void setCustomerCampaignSpecificationInstanceAnalysisData(String customerCampaignSpecificationInstanceAnalysisData) {
    this.customerCampaignSpecificationInstanceAnalysisData = customerCampaignSpecificationInstanceAnalysisData;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate
   * @return customerCampaignSpecificationInstanceAnalysisReport
  **/

  public Object getCustomerCampaignSpecificationInstanceAnalysisReport() {
    return customerCampaignSpecificationInstanceAnalysisReport;
  }

  public void setCustomerCampaignSpecificationInstanceAnalysisReport(Object customerCampaignSpecificationInstanceAnalysisReport) {
    this.customerCampaignSpecificationInstanceAnalysisReport = customerCampaignSpecificationInstanceAnalysisReport;
  }


}

