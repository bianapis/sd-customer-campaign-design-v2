package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerCampaignSpecificationExecuteInputModelCustomerCampaignSpecificationInstanceRecord;
import org.bian.dto.CRCustomerCampaignSpecificationExecuteInputModelExecuteRecordType;

import javax.validation.Valid;
  
/**
 * CRCustomerCampaignSpecificationExecuteInputModel
 */
public class CRCustomerCampaignSpecificationExecuteInputModel   {
  private String customerCampaignDesignServicingSessionReference = null;

  private String customerCampaignSpecificationInstanceReference = null;

  private CRCustomerCampaignSpecificationExecuteInputModelCustomerCampaignSpecificationInstanceRecord customerCampaignSpecificationInstanceRecord = null;

  private Object customerCampaignSpecificationExecuteActionTaskRecord = null;

  private CRCustomerCampaignSpecificationExecuteInputModelExecuteRecordType executeRecordType = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return customerCampaignDesignServicingSessionReference
  **/

  public String getCustomerCampaignDesignServicingSessionReference() {
    return customerCampaignDesignServicingSessionReference;
  }

  public void setCustomerCampaignDesignServicingSessionReference(String customerCampaignDesignServicingSessionReference) {
    this.customerCampaignDesignServicingSessionReference = customerCampaignDesignServicingSessionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Customer Campaign Specification instance 
   * @return customerCampaignSpecificationInstanceReference
  **/

  public String getCustomerCampaignSpecificationInstanceReference() {
    return customerCampaignSpecificationInstanceReference;
  }

  public void setCustomerCampaignSpecificationInstanceReference(String customerCampaignSpecificationInstanceReference) {
    this.customerCampaignSpecificationInstanceReference = customerCampaignSpecificationInstanceReference;
  }


  /**
   * Get customerCampaignSpecificationInstanceRecord
   * @return customerCampaignSpecificationInstanceRecord
  **/

  public CRCustomerCampaignSpecificationExecuteInputModelCustomerCampaignSpecificationInstanceRecord getCustomerCampaignSpecificationInstanceRecord() {
    return customerCampaignSpecificationInstanceRecord;
  }

  public void setCustomerCampaignSpecificationInstanceRecord(CRCustomerCampaignSpecificationExecuteInputModelCustomerCampaignSpecificationInstanceRecord customerCampaignSpecificationInstanceRecord) {
    this.customerCampaignSpecificationInstanceRecord = customerCampaignSpecificationInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The execute service call consolidated processing record 
   * @return customerCampaignSpecificationExecuteActionTaskRecord
  **/

  public Object getCustomerCampaignSpecificationExecuteActionTaskRecord() {
    return customerCampaignSpecificationExecuteActionTaskRecord;
  }

  public void setCustomerCampaignSpecificationExecuteActionTaskRecord(Object customerCampaignSpecificationExecuteActionTaskRecord) {
    this.customerCampaignSpecificationExecuteActionTaskRecord = customerCampaignSpecificationExecuteActionTaskRecord;
  }


  /**
   * Get executeRecordType
   * @return executeRecordType
  **/

  public CRCustomerCampaignSpecificationExecuteInputModelExecuteRecordType getExecuteRecordType() {
    return executeRecordType;
  }

  public void setExecuteRecordType(CRCustomerCampaignSpecificationExecuteInputModelExecuteRecordType executeRecordType) {
    this.executeRecordType = executeRecordType;
  }


}

