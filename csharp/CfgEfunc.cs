// Code generated by jtd-codegen for C# + System.Text.Json v0.2.1

using System.Text.Json.Serialization;

namespace Senzing
{
    public class CfgEfunc
    {
        [JsonPropertyName("CONNECT_STR")]
        public string ConnectStr { get; set; }

        [JsonPropertyName("EFUNC_CODE")]
        public string EfuncCode { get; set; }

        [JsonPropertyName("EFUNC_DESC")]
        public string EfuncDesc { get; set; }

        [JsonPropertyName("EFUNC_ID")]
        public int EfuncId { get; set; }

        [JsonPropertyName("FUNC_LIB")]
        public string FuncLib { get; set; }

        [JsonPropertyName("FUNC_VER")]
        public string FuncVer { get; set; }

        [JsonPropertyName("JAVA_CLASS_NAME")]
        public string JavaClassName { get; set; }

        [JsonPropertyName("LANGUAGE")]
        public string Language { get; set; }
    }
}
