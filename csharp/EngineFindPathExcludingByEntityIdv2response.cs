// Code generated by jtd-codegen for C# + System.Text.Json v0.2.1

using System;
using System.Text.Json;
using System.Text.Json.Serialization;

namespace Senzing
{
    [JsonConverter(typeof(EngineFindPathExcludingByEntityIdv2responseJsonConverter))]
    public class EngineFindPathExcludingByEntityIdv2response
    {
        /// <summary>
        /// The underlying data being wrapped.
        /// </summary>
        public Path Value { get; set; }
    }

    public class EngineFindPathExcludingByEntityIdv2responseJsonConverter : JsonConverter<EngineFindPathExcludingByEntityIdv2response>
    {
        public override EngineFindPathExcludingByEntityIdv2response Read(ref Utf8JsonReader reader, Type typeToConvert, JsonSerializerOptions options)
        {
            return new EngineFindPathExcludingByEntityIdv2response { Value = JsonSerializer.Deserialize<Path>(ref reader, options) };
        }

        public override void Write(Utf8JsonWriter writer, EngineFindPathExcludingByEntityIdv2response value, JsonSerializerOptions options)
        {
            JsonSerializer.Serialize<Path>(writer, value.Value, options);
        }
    }
}
