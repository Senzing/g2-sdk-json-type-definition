// Code generated by jtd-codegen for C# + System.Text.Json v0.2.1

using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Senzing
{
    public class EngineStatsResponseWorkloadSystemResources
    {
        [JsonPropertyName("currResources")]
        public IList<EngineStatsResponseWorkloadSystemResourcesCurrResource> CurrResources { get; set; }

        [JsonPropertyName("initResources")]
        public IList<EngineStatsResponseWorkloadSystemResourcesInitResource> InitResources { get; set; }
    }
}
