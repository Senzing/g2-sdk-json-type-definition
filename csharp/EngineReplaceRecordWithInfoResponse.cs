// Code generated by jtd-codegen for C# + System.Text.Json v0.2.1

using System;
using System.Text.Json;
using System.Text.Json.Serialization;

namespace Senzing
{
    [JsonConverter(typeof(EngineReplaceRecordWithInfoResponseJsonConverter))]
    public class EngineReplaceRecordWithInfoResponse
    {
        /// <summary>
        /// The underlying data being wrapped.
        /// </summary>
        public WithInfo Value { get; set; }
    }

    public class EngineReplaceRecordWithInfoResponseJsonConverter : JsonConverter<EngineReplaceRecordWithInfoResponse>
    {
        public override EngineReplaceRecordWithInfoResponse Read(ref Utf8JsonReader reader, Type typeToConvert, JsonSerializerOptions options)
        {
            return new EngineReplaceRecordWithInfoResponse { Value = JsonSerializer.Deserialize<WithInfo>(ref reader, options) };
        }

        public override void Write(Utf8JsonWriter writer, EngineReplaceRecordWithInfoResponse value, JsonSerializerOptions options)
        {
            JsonSerializer.Serialize<WithInfo>(writer, value.Value, options);
        }
    }
}
