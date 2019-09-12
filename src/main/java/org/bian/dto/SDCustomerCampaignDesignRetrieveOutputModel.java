package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDCustomerCampaignDesignRetrieveOutputModelServiceDomainOfferedService;
import org.bian.dto.SDCustomerCampaignDesignRetrieveOutputModelServiceDomainRetrieveActionRecord;

import javax.validation.Valid;
  
/**
 * SDCustomerCampaignDesignRetrieveOutputModel
 */
public class SDCustomerCampaignDesignRetrieveOutputModel   {
  private String serviceDomainRetrieveActionTaskReference = null;

  private Object serviceDomainRetrieveActionTaskRecord = null;

  private String serviceDomainRetrieveActionResponse = null;

  private SDCustomerCampaignDesignRetrieveOutputModelServiceDomainRetrieveActionRecord serviceDomainRetrieveActionRecord = null;

  private SDCustomerCampaignDesignRetrieveOutputModelServiceDomainOfferedService serviceDomainOfferedService = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a retrieve service call 
   * @return serviceDomainRetrieveActionTaskReference
  **/

  public String getServiceDomainRetrieveActionTaskReference() {
    return serviceDomainRetrieveActionTaskReference;
  }

  public void setServiceDomainRetrieveActionTaskReference(String serviceDomainRetrieveActionTaskReference) {
    this.serviceDomainRetrieveActionTaskReference = serviceDomainRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return serviceDomainRetrieveActionTaskRecord
  **/

  public Object getServiceDomainRetrieveActionTaskRecord() {
    return serviceDomainRetrieveActionTaskRecord;
  }

  public void setServiceDomainRetrieveActionTaskRecord(Object serviceDomainRetrieveActionTaskRecord) {
    this.serviceDomainRetrieveActionTaskRecord = serviceDomainRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return serviceDomainRetrieveActionResponse
  **/

  public String getServiceDomainRetrieveActionResponse() {
    return serviceDomainRetrieveActionResponse;
  }

  public void setServiceDomainRetrieveActionResponse(String serviceDomainRetrieveActionResponse) {
    this.serviceDomainRetrieveActionResponse = serviceDomainRetrieveActionResponse;
  }


  /**
   * Get serviceDomainRetrieveActionRecord
   * @return serviceDomainRetrieveActionRecord
  **/

  public SDCustomerCampaignDesignRetrieveOutputModelServiceDomainRetrieveActionRecord getServiceDomainRetrieveActionRecord() {
    return serviceDomainRetrieveActionRecord;
  }

  public void setServiceDomainRetrieveActionRecord(SDCustomerCampaignDesignRetrieveOutputModelServiceDomainRetrieveActionRecord serviceDomainRetrieveActionRecord) {
    this.serviceDomainRetrieveActionRecord = serviceDomainRetrieveActionRecord;
  }


  /**
   * Get serviceDomainOfferedService
   * @return serviceDomainOfferedService
  **/

  public SDCustomerCampaignDesignRetrieveOutputModelServiceDomainOfferedService getServiceDomainOfferedService() {
    return serviceDomainOfferedService;
  }

  public void setServiceDomainOfferedService(SDCustomerCampaignDesignRetrieveOutputModelServiceDomainOfferedService serviceDomainOfferedService) {
    this.serviceDomainOfferedService = serviceDomainOfferedService;
  }


}

