// Code generated by jtd-codegen for C# + System.Text.Json v0.2.1

using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Senzing
{
    public class G2engineStatsResponseWorkloadSystemResources
    {
        [JsonPropertyName("currResources")]
        public IList<G2engineStatsResponseWorkloadSystemResourcesCurrResource> CurrResources { get; set; }

        [JsonPropertyName("initResources")]
        public IList<G2engineStatsResponseWorkloadSystemResourcesInitResource> InitResources { get; set; }
    }
}
