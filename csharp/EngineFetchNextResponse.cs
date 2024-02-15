// Code generated by jtd-codegen for C# + System.Text.Json v0.2.1

using System;
using System.Text.Json;
using System.Text.Json.Serialization;

namespace Senzing
{
    [JsonConverter(typeof(EngineFetchNextResponseJsonConverter))]
    public class EngineFetchNextResponse
    {
        /// <summary>
        /// The underlying data being wrapped.
        /// </summary>
        public object Value { get; set; }
    }

    public class EngineFetchNextResponseJsonConverter : JsonConverter<EngineFetchNextResponse>
    {
        public override EngineFetchNextResponse Read(ref Utf8JsonReader reader, Type typeToConvert, JsonSerializerOptions options)
        {
            return new EngineFetchNextResponse { Value = JsonSerializer.Deserialize<object>(ref reader, options) };
        }

        public override void Write(Utf8JsonWriter writer, EngineFetchNextResponse value, JsonSerializerOptions options)
        {
            JsonSerializer.Serialize<object>(writer, value.Value, options);
        }
    }
}
