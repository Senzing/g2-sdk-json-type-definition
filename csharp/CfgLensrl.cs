// Code generated by jtd-codegen for C# + System.Text.Json v0.2.1

using System;
using System.Collections.Generic;
using System.Text.Json;
using System.Text.Json.Serialization;

namespace Senzing
{
    [JsonConverter(typeof(CfgLensrlJsonConverter))]
    public class CfgLensrl
    {
        /// <summary>
        /// The underlying data being wrapped.
        /// </summary>
        public IList<FixmeUnknown> Value { get; set; }
    }

    public class CfgLensrlJsonConverter : JsonConverter<CfgLensrl>
    {
        public override CfgLensrl Read(ref Utf8JsonReader reader, Type typeToConvert, JsonSerializerOptions options)
        {
            return new CfgLensrl { Value = JsonSerializer.Deserialize<IList<FixmeUnknown>>(ref reader, options) };
        }

        public override void Write(Utf8JsonWriter writer, CfgLensrl value, JsonSerializerOptions options)
        {
            JsonSerializer.Serialize<IList<FixmeUnknown>>(writer, value.Value, options);
        }
    }
}
