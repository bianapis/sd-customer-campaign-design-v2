package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerCampaignSpecificationRetrieveOutputModelCustomerCampaignSpecificationInstanceAnalysis;
import org.bian.dto.CRCustomerCampaignSpecificationRetrieveOutputModelCustomerCampaignSpecificationInstanceRecord;
import org.bian.dto.CRCustomerCampaignSpecificationRetrieveOutputModelCustomerCampaignSpecificationInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRCustomerCampaignSpecificationRetrieveOutputModel
 */
public class CRCustomerCampaignSpecificationRetrieveOutputModel   {
  private CRCustomerCampaignSpecificationRetrieveOutputModelCustomerCampaignSpecificationInstanceRecord customerCampaignSpecificationInstanceRecord = null;

  private String customerCampaignSpecificationRetrieveActionTaskReference = null;

  private Object customerCampaignSpecificationRetrieveActionTaskRecord = null;

  private String customerCampaignSpecificationRetrieveActionResponse = null;

  private CRCustomerCampaignSpecificationRetrieveOutputModelCustomerCampaignSpecificationInstanceReportRecord customerCampaignSpecificationInstanceReportRecord = null;

  private CRCustomerCampaignSpecificationRetrieveOutputModelCustomerCampaignSpecificationInstanceAnalysis customerCampaignSpecificationInstanceAnalysis = null;


  /**
   * Get customerCampaignSpecificationInstanceRecord
   * @return customerCampaignSpecificationInstanceRecord
  **/

  public CRCustomerCampaignSpecificationRetrieveOutputModelCustomerCampaignSpecificationInstanceRecord getCustomerCampaignSpecificationInstanceRecord() {
    return customerCampaignSpecificationInstanceRecord;
  }

  public void setCustomerCampaignSpecificationInstanceRecord(CRCustomerCampaignSpecificationRetrieveOutputModelCustomerCampaignSpecificationInstanceRecord customerCampaignSpecificationInstanceRecord) {
    this.customerCampaignSpecificationInstanceRecord = customerCampaignSpecificationInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Customer Campaign Specification instance retrieve service call 
   * @return customerCampaignSpecificationRetrieveActionTaskReference
  **/

  public String getCustomerCampaignSpecificationRetrieveActionTaskReference() {
    return customerCampaignSpecificationRetrieveActionTaskReference;
  }

  public void setCustomerCampaignSpecificationRetrieveActionTaskReference(String customerCampaignSpecificationRetrieveActionTaskReference) {
    this.customerCampaignSpecificationRetrieveActionTaskReference = customerCampaignSpecificationRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return customerCampaignSpecificationRetrieveActionResponse
  **/

  public String getCustomerCampaignSpecificationRetrieveActionResponse() {
    return customerCampaignSpecificationRetrieveActionResponse;
  }

  public void setCustomerCampaignSpecificationRetrieveActionResponse(String customerCampaignSpecificationRetrieveActionResponse) {
    this.customerCampaignSpecificationRetrieveActionResponse = customerCampaignSpecificationRetrieveActionResponse;
  }


  /**
   * Get customerCampaignSpecificationInstanceReportRecord
   * @return customerCampaignSpecificationInstanceReportRecord
  **/

  public CRCustomerCampaignSpecificationRetrieveOutputModelCustomerCampaignSpecificationInstanceReportRecord getCustomerCampaignSpecificationInstanceReportRecord() {
    return customerCampaignSpecificationInstanceReportRecord;
  }

  public void setCustomerCampaignSpecificationInstanceReportRecord(CRCustomerCampaignSpecificationRetrieveOutputModelCustomerCampaignSpecificationInstanceReportRecord customerCampaignSpecificationInstanceReportRecord) {
    this.customerCampaignSpecificationInstanceReportRecord = customerCampaignSpecificationInstanceReportRecord;
  }


  /**
   * Get customerCampaignSpecificationInstanceAnalysis
   * @return customerCampaignSpecificationInstanceAnalysis
  **/

  public CRCustomerCampaignSpecificationRetrieveOutputModelCustomerCampaignSpecificationInstanceAnalysis getCustomerCampaignSpecificationInstanceAnalysis() {
    return customerCampaignSpecificationInstanceAnalysis;
  }

  public void setCustomerCampaignSpecificationInstanceAnalysis(CRCustomerCampaignSpecificationRetrieveOutputModelCustomerCampaignSpecificationInstanceAnalysis customerCampaignSpecificationInstanceAnalysis) {
    this.customerCampaignSpecificationInstanceAnalysis = customerCampaignSpecificationInstanceAnalysis;
  }


}

