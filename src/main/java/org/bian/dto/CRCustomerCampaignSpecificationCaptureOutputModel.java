package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerCampaignSpecificationCaptureOutputModelCustomerCampaignSpecificationInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRCustomerCampaignSpecificationCaptureOutputModel
 */
public class CRCustomerCampaignSpecificationCaptureOutputModel   {
  private CRCustomerCampaignSpecificationCaptureOutputModelCustomerCampaignSpecificationInstanceRecord customerCampaignSpecificationInstanceRecord = null;

  private String customerCampaignSpecificationCaptureActionTaskReference = null;

  private Object customerCampaignSpecificationCaptureActionTaskRecord = null;

  private String captureRecordReference = null;

  private Object captureResponseRecord = null;


  /**
   * Get customerCampaignSpecificationInstanceRecord
   * @return customerCampaignSpecificationInstanceRecord
  **/

  public CRCustomerCampaignSpecificationCaptureOutputModelCustomerCampaignSpecificationInstanceRecord getCustomerCampaignSpecificationInstanceRecord() {
    return customerCampaignSpecificationInstanceRecord;
  }

  public void setCustomerCampaignSpecificationInstanceRecord(CRCustomerCampaignSpecificationCaptureOutputModelCustomerCampaignSpecificationInstanceRecord customerCampaignSpecificationInstanceRecord) {
    this.customerCampaignSpecificationInstanceRecord = customerCampaignSpecificationInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Customer Campaign Specification instance capture service call 
   * @return customerCampaignSpecificationCaptureActionTaskReference
  **/

  public String getCustomerCampaignSpecificationCaptureActionTaskReference() {
    return customerCampaignSpecificationCaptureActionTaskReference;
  }

  public void setCustomerCampaignSpecificationCaptureActionTaskReference(String customerCampaignSpecificationCaptureActionTaskReference) {
    this.customerCampaignSpecificationCaptureActionTaskReference = customerCampaignSpecificationCaptureActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The capture service call consolidated processing record 
   * @return customerCampaignSpecificationCaptureActionTaskRecord
  **/

  public Object getCustomerCampaignSpecificationCaptureActionTaskRecord() {
    return customerCampaignSpecificationCaptureActionTaskRecord;
  }

  public void setCustomerCampaignSpecificationCaptureActionTaskRecord(Object customerCampaignSpecificationCaptureActionTaskRecord) {
    this.customerCampaignSpecificationCaptureActionTaskRecord = customerCampaignSpecificationCaptureActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the structured input transaction/record 
   * @return captureRecordReference
  **/

  public String getCaptureRecordReference() {
    return captureRecordReference;
  }

  public void setCaptureRecordReference(String captureRecordReference) {
    this.captureRecordReference = captureRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the capture action service response 
   * @return captureResponseRecord
  **/

  public Object getCaptureResponseRecord() {
    return captureResponseRecord;
  }

  public void setCaptureResponseRecord(Object captureResponseRecord) {
    this.captureResponseRecord = captureResponseRecord;
  }


}

