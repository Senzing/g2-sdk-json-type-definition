// Code generated by jtd-codegen for C# + System.Text.Json v0.2.1

using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Senzing
{
    public class ProcessResult
    {
        [JsonPropertyName("RESOLVED_ENTITIES")]
        public IList<ProcessResultResolvedEntities> ResolvedEntities { get; set; }
    }
}
