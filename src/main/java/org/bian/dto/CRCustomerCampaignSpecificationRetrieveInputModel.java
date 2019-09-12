package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerCampaignSpecificationRetrieveInputModelCustomerCampaignSpecificationInstanceAnalysis;
import org.bian.dto.CRCustomerCampaignSpecificationRetrieveInputModelCustomerCampaignSpecificationInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRCustomerCampaignSpecificationRetrieveInputModel
 */
public class CRCustomerCampaignSpecificationRetrieveInputModel   {
  private Object customerCampaignSpecificationRetrieveActionTaskRecord = null;

  private String customerCampaignSpecificationRetrieveActionRequest = null;

  private CRCustomerCampaignSpecificationRetrieveInputModelCustomerCampaignSpecificationInstanceReportRecord customerCampaignSpecificationInstanceReportRecord = null;

  private CRCustomerCampaignSpecificationRetrieveInputModelCustomerCampaignSpecificationInstanceAnalysis customerCampaignSpecificationInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return customerCampaignSpecificationRetrieveActionTaskRecord
  **/

  public Object getCustomerCampaignSpecificationRetrieveActionTaskRecord() {
    return customerCampaignSpecificationRetrieveActionTaskRecord;
  }

  public void setCustomerCampaignSpecificationRetrieveActionTaskRecord(Object customerCampaignSpecificationRetrieveActionTaskRecord) {
    this.customerCampaignSpecificationRetrieveActionTaskRecord = customerCampaignSpecificationRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return customerCampaignSpecificationRetrieveActionRequest
  **/

  public String getCustomerCampaignSpecificationRetrieveActionRequest() {
    return customerCampaignSpecificationRetrieveActionRequest;
  }

  public void setCustomerCampaignSpecificationRetrieveActionRequest(String customerCampaignSpecificationRetrieveActionRequest) {
    this.customerCampaignSpecificationRetrieveActionRequest = customerCampaignSpecificationRetrieveActionRequest;
  }


  /**
   * Get customerCampaignSpecificationInstanceReportRecord
   * @return customerCampaignSpecificationInstanceReportRecord
  **/

  public CRCustomerCampaignSpecificationRetrieveInputModelCustomerCampaignSpecificationInstanceReportRecord getCustomerCampaignSpecificationInstanceReportRecord() {
    return customerCampaignSpecificationInstanceReportRecord;
  }

  public void setCustomerCampaignSpecificationInstanceReportRecord(CRCustomerCampaignSpecificationRetrieveInputModelCustomerCampaignSpecificationInstanceReportRecord customerCampaignSpecificationInstanceReportRecord) {
    this.customerCampaignSpecificationInstanceReportRecord = customerCampaignSpecificationInstanceReportRecord;
  }


  /**
   * Get customerCampaignSpecificationInstanceAnalysis
   * @return customerCampaignSpecificationInstanceAnalysis
  **/

  public CRCustomerCampaignSpecificationRetrieveInputModelCustomerCampaignSpecificationInstanceAnalysis getCustomerCampaignSpecificationInstanceAnalysis() {
    return customerCampaignSpecificationInstanceAnalysis;
  }

  public void setCustomerCampaignSpecificationInstanceAnalysis(CRCustomerCampaignSpecificationRetrieveInputModelCustomerCampaignSpecificationInstanceAnalysis customerCampaignSpecificationInstanceAnalysis) {
    this.customerCampaignSpecificationInstanceAnalysis = customerCampaignSpecificationInstanceAnalysis;
  }


}

