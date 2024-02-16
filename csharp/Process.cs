// Code generated by jtd-codegen for C# + System.Text.Json v0.2.1

using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Senzing
{
    public class Process
    {
        [JsonPropertyName("AFFECTED_ENTITIES")]
        public IList<AffectedEntity> AffectedEntities { get; set; }

        [JsonPropertyName("INTERESTING_ENTITIES")]
        public InterestingEntities InterestingEntities { get; set; }

        [JsonPropertyName("PROCESS_RESULT")]
        public ProcessResult ProcessResult { get; set; }

        [JsonPropertyName("UMF_PROC")]
        public ProcessUmfProc UmfProc { get; set; }
    }
}
