package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCustomerCampaignSpecificationRetrieveOutputModelCustomerCampaignSpecificationInstanceReportRecord
 */
public class CRCustomerCampaignSpecificationRetrieveOutputModelCustomerCampaignSpecificationInstanceReportRecord   {
  private String customerCampaignSpecificationInstanceReportData = null;

  private String customerCampaignSpecificationInstanceReportType = null;

  private Object customerCampaignSpecificationInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return customerCampaignSpecificationInstanceReportData
  **/

  public String getCustomerCampaignSpecificationInstanceReportData() {
    return customerCampaignSpecificationInstanceReportData;
  }

  public void setCustomerCampaignSpecificationInstanceReportData(String customerCampaignSpecificationInstanceReportData) {
    this.customerCampaignSpecificationInstanceReportData = customerCampaignSpecificationInstanceReportData;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return customerCampaignSpecificationInstanceReport
  **/

  public Object getCustomerCampaignSpecificationInstanceReport() {
    return customerCampaignSpecificationInstanceReport;
  }

  public void setCustomerCampaignSpecificationInstanceReport(Object customerCampaignSpecificationInstanceReport) {
    this.customerCampaignSpecificationInstanceReport = customerCampaignSpecificationInstanceReport;
  }


}

