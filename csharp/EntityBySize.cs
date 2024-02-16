// Code generated by jtd-codegen for C# + System.Text.Json v0.2.1

using System.Text.Json.Serialization;

namespace Senzing
{
    public class EntityBySize
    {
        [JsonPropertyName("DSRC_CODE")]
        public string DsrcCode { get; set; }

        [JsonPropertyName("ENT_SRC_DESC")]
        public string EntSrcDesc { get; set; }

        [JsonPropertyName("ENT_SRC_KEY")]
        public string EntSrcKey { get; set; }

        [JsonPropertyName("ERRULE_CODE")]
        public string ErruleCode { get; set; }

        [JsonPropertyName("ER_ID")]
        public int ErId { get; set; }

        [JsonPropertyName("ETYPE_CODE")]
        public string EtypeCode { get; set; }

        [JsonPropertyName("JSON_DATA")]
        public string JsonData { get; set; }

        [JsonPropertyName("MATCH_KEY")]
        public string MatchKey { get; set; }

        [JsonPropertyName("OBS_ENT_ID")]
        public int ObsEntId { get; set; }

        [JsonPropertyName("RECORD_ID")]
        public string RecordId { get; set; }

        [JsonPropertyName("RES_ENT_ID")]
        public int ResEntId { get; set; }
    }
}
