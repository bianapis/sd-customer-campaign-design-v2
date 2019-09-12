package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDCustomerCampaignDesignRetrieveOutputModelServiceDomainRetrieveActionRecordControlRecordPortfolioAnalysis;
import org.bian.dto.SDCustomerCampaignDesignRetrieveOutputModelServiceDomainRetrieveActionRecordServiceDomainActivityAnalysis;
import org.bian.dto.SDCustomerCampaignDesignRetrieveOutputModelServiceDomainRetrieveActionRecordServiceDomainPerformanceAnalysis;

import javax.validation.Valid;
  
/**
 * SDCustomerCampaignDesignRetrieveOutputModelServiceDomainRetrieveActionRecord
 */
public class SDCustomerCampaignDesignRetrieveOutputModelServiceDomainRetrieveActionRecord   {
  private SDCustomerCampaignDesignRetrieveOutputModelServiceDomainRetrieveActionRecordServiceDomainActivityAnalysis serviceDomainActivityAnalysis = null;

  private SDCustomerCampaignDesignRetrieveOutputModelServiceDomainRetrieveActionRecordServiceDomainPerformanceAnalysis serviceDomainPerformanceAnalysis = null;

  private SDCustomerCampaignDesignRetrieveOutputModelServiceDomainRetrieveActionRecordControlRecordPortfolioAnalysis controlRecordPortfolioAnalysis = null;


  /**
   * Get serviceDomainActivityAnalysis
   * @return serviceDomainActivityAnalysis
  **/

  public SDCustomerCampaignDesignRetrieveOutputModelServiceDomainRetrieveActionRecordServiceDomainActivityAnalysis getServiceDomainActivityAnalysis() {
    return serviceDomainActivityAnalysis;
  }

  public void setServiceDomainActivityAnalysis(SDCustomerCampaignDesignRetrieveOutputModelServiceDomainRetrieveActionRecordServiceDomainActivityAnalysis serviceDomainActivityAnalysis) {
    this.serviceDomainActivityAnalysis = serviceDomainActivityAnalysis;
  }


  /**
   * Get serviceDomainPerformanceAnalysis
   * @return serviceDomainPerformanceAnalysis
  **/

  public SDCustomerCampaignDesignRetrieveOutputModelServiceDomainRetrieveActionRecordServiceDomainPerformanceAnalysis getServiceDomainPerformanceAnalysis() {
    return serviceDomainPerformanceAnalysis;
  }

  public void setServiceDomainPerformanceAnalysis(SDCustomerCampaignDesignRetrieveOutputModelServiceDomainRetrieveActionRecordServiceDomainPerformanceAnalysis serviceDomainPerformanceAnalysis) {
    this.serviceDomainPerformanceAnalysis = serviceDomainPerformanceAnalysis;
  }


  /**
   * Get controlRecordPortfolioAnalysis
   * @return controlRecordPortfolioAnalysis
  **/

  public SDCustomerCampaignDesignRetrieveOutputModelServiceDomainRetrieveActionRecordControlRecordPortfolioAnalysis getControlRecordPortfolioAnalysis() {
    return controlRecordPortfolioAnalysis;
  }

  public void setControlRecordPortfolioAnalysis(SDCustomerCampaignDesignRetrieveOutputModelServiceDomainRetrieveActionRecordControlRecordPortfolioAnalysis controlRecordPortfolioAnalysis) {
    this.controlRecordPortfolioAnalysis = controlRecordPortfolioAnalysis;
  }


}

