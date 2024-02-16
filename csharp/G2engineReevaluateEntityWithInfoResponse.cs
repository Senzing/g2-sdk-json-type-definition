// Code generated by jtd-codegen for C# + System.Text.Json v0.2.1

using System;
using System.Text.Json;
using System.Text.Json.Serialization;

namespace Senzing
{
    [JsonConverter(typeof(G2engineReevaluateEntityWithInfoResponseJsonConverter))]
    public class G2engineReevaluateEntityWithInfoResponse
    {
        /// <summary>
        /// The underlying data being wrapped.
        /// </summary>
        public WithInfo Value { get; set; }
    }

    public class G2engineReevaluateEntityWithInfoResponseJsonConverter : JsonConverter<G2engineReevaluateEntityWithInfoResponse>
    {
        public override G2engineReevaluateEntityWithInfoResponse Read(ref Utf8JsonReader reader, Type typeToConvert, JsonSerializerOptions options)
        {
            return new G2engineReevaluateEntityWithInfoResponse { Value = JsonSerializer.Deserialize<WithInfo>(ref reader, options) };
        }

        public override void Write(Utf8JsonWriter writer, G2engineReevaluateEntityWithInfoResponse value, JsonSerializerOptions options)
        {
            JsonSerializer.Serialize<WithInfo>(writer, value.Value, options);
        }
    }
}
